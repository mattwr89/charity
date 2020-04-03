package pl.coderslab.charity.app.services;

import pl.coderslab.charity.app.controllers.dtos.CreateDonationRequest;

public interface DonationService {

    void donate(CreateDonationRequest donationData);
}
