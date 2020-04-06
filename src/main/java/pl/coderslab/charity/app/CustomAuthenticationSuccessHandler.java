package pl.coderslab.charity.app;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import pl.coderslab.charity.app.domain.entities.User;
import pl.coderslab.charity.app.domain.repositories.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    private final UserRepository userRepository;

    public CustomAuthenticationSuccessHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        String username = authentication.getName();
        User loggedUser = userRepository.findOneByUsername(username);
        loggedUser.setLogged(true);
        userRepository.save(loggedUser);
    }
}
