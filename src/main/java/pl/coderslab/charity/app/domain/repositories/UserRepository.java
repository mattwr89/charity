package pl.coderslab.charity.app.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.app.domain.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByUsername(String username);
}
