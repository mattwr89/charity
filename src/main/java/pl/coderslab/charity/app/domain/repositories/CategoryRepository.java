package pl.coderslab.charity.app.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.app.domain.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
