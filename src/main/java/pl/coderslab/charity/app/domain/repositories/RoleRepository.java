package pl.coderslab.charity.app.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.app.domain.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role getOneByName(String name);
}
