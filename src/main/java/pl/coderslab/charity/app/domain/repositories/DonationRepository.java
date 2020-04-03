package pl.coderslab.charity.app.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.app.domain.entities.Donation;





public interface DonationRepository extends JpaRepository<Donation, Long> {

    @Query(value = "SELECT COUNT (d.id) FROM Donation d")
    Integer countAllById();

    @Query(value = "SELECT SUM (d.quantity) FROM Donation d")
    Integer quantitySum();

}
