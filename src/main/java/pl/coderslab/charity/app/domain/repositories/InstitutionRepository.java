package pl.coderslab.charity.app.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.app.domain.entities.Institution;



public interface InstitutionRepository extends JpaRepository<Institution, Long> {

}
