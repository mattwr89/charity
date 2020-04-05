package pl.coderslab.charity.app.services.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.app.domain.entities.User;
import pl.coderslab.charity.app.domain.repositories.UserRepository;
import pl.coderslab.charity.app.dtos.RegistrationDataDTO;
import pl.coderslab.charity.app.services.RegistrationService;

import javax.transaction.Transactional;

@Service
@Transactional
public class DefaultRegistrationService implements RegistrationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public DefaultRegistrationService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void registerUser(RegistrationDataDTO registerData){
        User user = new User();
        user.setUsername(registerData.getUsername());
        user.setEmail(registerData.getEmail());
        user.setPassword(passwordEncoder.encode(registerData.getPassword()));
        user.setActive(true);

        userRepository.save(user);

    }
}
