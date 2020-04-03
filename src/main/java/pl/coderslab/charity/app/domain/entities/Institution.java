package pl.coderslab.charity.app.domain.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "institution")
@Getter @Setter @ToString (exclude = "donations" ) @EqualsAndHashCode (of = "id")
public class Institution {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToMany (mappedBy = "institution")
    private List<Donation> donations;


}
