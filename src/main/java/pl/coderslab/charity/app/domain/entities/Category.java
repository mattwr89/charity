package pl.coderslab.charity.app.domain.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table (name = "   category")
@Getter @Setter @ToString @EqualsAndHashCode (of = "id")
public class Category {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


}
