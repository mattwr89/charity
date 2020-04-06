package pl.coderslab.charity.app.services.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.app.domain.entities.Role;
import pl.coderslab.charity.app.domain.entities.User;
import pl.coderslab.charity.app.domain.repositories.RoleRepository;
import pl.coderslab.charity.app.domain.repositories.UserRepository;
import pl.coderslab.charity.app.dtos.RegistrationDataDTO;
import pl.coderslab.charity.app.services.RegistrationService;

import javax.transaction.Transactional;

@Service
@Transactional
public class DefaultRegistrationService implements RegistrationService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public DefaultRegistrationService(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void registerUser(RegistrationDataDTO registerData){
        User user = new User();
        user.setUsername(registerData.getUsername());
        user.setEmail(registerData.getEmail());
        user.setPassword(passwordEncoder.encode(registerData.getPassword()));
        user.setActive(true);
        Role roleUser = roleRepository.getOneByName("USER");
        user.getRoles().add(roleUser);

        userRepository.save(user);

    }
}
