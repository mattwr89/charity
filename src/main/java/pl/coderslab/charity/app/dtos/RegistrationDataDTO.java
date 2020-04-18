package pl.coderslab.charity.app.dtos;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Data
@ToString (exclude = "password")
public class RegistrationDataDTO {


    private Long id;
    @NotBlank
    @Size(min = 4,max = 15)
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    @Email
    private String email;
    private Boolean active;


}
