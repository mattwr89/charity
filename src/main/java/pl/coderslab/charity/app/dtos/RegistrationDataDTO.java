package pl.coderslab.charity.app.dtos;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Data @ToString (exclude = "password")
public class RegistrationDataDTO {

    @NotBlank
    private String username;
    @Email
    private String email;
    @NotBlank
    private String password;



}
