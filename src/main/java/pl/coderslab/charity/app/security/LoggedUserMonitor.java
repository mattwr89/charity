package pl.coderslab.charity.app.security;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import pl.coderslab.charity.app.domain.entities.User;
import pl.coderslab.charity.app.domain.repositories.UserRepository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class LoggedUserMonitor {

    private final UserRepository userRepository;

    public LoggedUserMonitor(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void loggedUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            String username = authentication.getName();
            User loggedUser = userRepository.findOneByUsername(username);
            loggedUser.setLogged(true);
            userRepository.save(loggedUser);
        }
    }

    @PreDestroy
    public void unloggedUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            String username = authentication.getName();
            User loggedUser = userRepository.findOneByUsername(username);
            loggedUser.setLogged(false);
            userRepository.save(loggedUser);
        }
    }
}
