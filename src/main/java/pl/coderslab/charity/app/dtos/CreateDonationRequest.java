package pl.coderslab.charity.app.dtos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;;
import java.time.LocalTime;
import java.util.List;

@Data
public class CreateDonationRequest {

    @NotNull
    private Integer quantity;
    private List<Long> categoriesId;
    private Long institutionId;
    private String street;
    private String city;
    private String zipCode;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private String pickUpComment;


}
