package pl.coderslab.charity.app.services.impl;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.app.controllers.dtos.CreateDonationRequest;
import pl.coderslab.charity.app.domain.entities.Category;
import pl.coderslab.charity.app.domain.entities.Donation;
import pl.coderslab.charity.app.domain.entities.Institution;
import pl.coderslab.charity.app.domain.repositories.CategoryRepository;
import pl.coderslab.charity.app.domain.repositories.DonationRepository;
import pl.coderslab.charity.app.domain.repositories.InstitutionRepository;
import pl.coderslab.charity.app.services.DonationService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DefaultDonationService implements DonationService {

    private final DonationRepository donationRepository;
    private final InstitutionRepository institutionRepository;
    private final CategoryRepository categoryRepository;

    public DefaultDonationService(DonationRepository donationRepository, InstitutionRepository institutionRepository, CategoryRepository categoryRepository) {
        this.donationRepository = donationRepository;
        this.institutionRepository = institutionRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void donate(CreateDonationRequest donationData) {
        Donation donation = new Donation();
        donation.setCity(donationData.getCity());
        donation.setStreet(donationData.getStreet());
        donation.setQuantity(donationData.getQuantity());
        donation.setPickUpDate(donationData.getPickUpDate());

     Institution institution = institutionRepository.getOne(donationData.getInstitutionId());
        List<Category> categories = categoryRepository.findAllById(donationData.getCategoriesId());
        donation.setInstitution(institution);
        donation.setCategories(categories);
        donationRepository.save(donation);

    }
}
