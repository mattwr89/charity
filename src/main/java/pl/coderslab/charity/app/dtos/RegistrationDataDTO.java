package pl.coderslab.charity.app.dtos;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Data @ToString (exclude = "password")
public class RegistrationDataDTO {


    @Column( nullable = false, unique = true)
    private String username;
    @Email
    @Column (nullable = false, unique = true)
    private String email;
    @Column (nullable = false)
    private String password;



}
