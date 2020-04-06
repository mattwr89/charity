package pl.coderslab.charity.app.domain.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
public class Role {

    // INSERT INTO roles (name) VALUES ('ROLE_USER'), ('ROLE_ADMIN')

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String name;
}
