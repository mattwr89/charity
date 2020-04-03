package pl.coderslab.charity.app.services;

import pl.coderslab.charity.app.dtos.CategoryDTO;
import pl.coderslab.charity.app.dtos.CreateDonationRequest;
import pl.coderslab.charity.app.dtos.InstituionDTO;

import java.util.List;

public interface DonationService {

    void donate(CreateDonationRequest donationData);

    List<CategoryDTO> availableCategories();

    List<InstituionDTO> availableInstitutions();
}
