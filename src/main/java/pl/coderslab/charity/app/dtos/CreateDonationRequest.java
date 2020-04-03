package pl.coderslab.charity.app.dtos;

import lombok.Data;

import java.time.LocalDate;;
import java.time.LocalTime;
import java.util.List;

@Data
public class CreateDonationRequest {


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
