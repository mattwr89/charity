package pl.coderslab.charity.app.domain.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table (name = "donation")
@Getter @Setter @ToString (exclude = {"categories", "institution", "user"}) @EqualsAndHashCode (of = "id")
public class Donation {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;
    private String street;
    private String city;
    private String zipCode;
    private LocalDate pickUpDate;
    private LocalDateTime pickUpTime;
    private String pickUpComment;

    @ManyToMany
    private List <Category> categories;
    @ManyToOne
    private Institution institution;
    @ManyToOne
    private User user;


}
