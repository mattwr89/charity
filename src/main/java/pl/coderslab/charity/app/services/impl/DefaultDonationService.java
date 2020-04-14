package pl.coderslab.charity.app.services.impl;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.app.dtos.CategoryDTO;
import pl.coderslab.charity.app.dtos.CreateDonationRequest;
import pl.coderslab.charity.app.domain.entities.Category;
import pl.coderslab.charity.app.domain.entities.Donation;
import pl.coderslab.charity.app.domain.entities.Institution;
import pl.coderslab.charity.app.domain.repositories.CategoryRepository;
import pl.coderslab.charity.app.domain.repositories.DonationRepository;
import pl.coderslab.charity.app.domain.repositories.InstitutionRepository;
import pl.coderslab.charity.app.dtos.InstituionDTO;
import pl.coderslab.charity.app.services.DonationService;

import javax.transaction.Transactional;
import java.util.ArrayList;
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
        donation.setPhoneNumber(donationData.getPhoneNumber());
        donation.setPickUpComment(donationData.getPickUpComment());
        donation.setPickUpDate(donationData.getPickUpDate());
        donation.setPickUpTime(donationData.getPickUpTime());
        donation.setQuantity(donationData.getQuantity());
        donation.setStreet(donationData.getStreet());
        donation.setZipCode(donationData.getZipCode());

     Institution institution = institutionRepository.getOne(donationData.getInstitutionId());
        List<Category> categories = categoryRepository.findAllById(donationData.getCategoriesId());
        donation.setInstitution(institution);
        donation.setCategories(categories);

        donationRepository.save(donation);



    }

    @Override
    public List<CategoryDTO> availableCategories() {
        List<Category> categories = categoryRepository.findAll();
        List<CategoryDTO> categoriesDTO = new ArrayList<>();
        for(Category category : categories) {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(category.getId());
            categoryDTO.setName(category.getName());
            categoriesDTO.add(categoryDTO);
        }
        return categoriesDTO;
    }

    @Override
    public List<InstituionDTO> availableInstitutions() {
        List<Institution> institutions = institutionRepository.findAll();
        List<InstituionDTO> instituionDTOS = new ArrayList<>();
        for (Institution institution : institutions) {
            InstituionDTO instituionDTO = new InstituionDTO();
            instituionDTO.setId(institution.getId());
            instituionDTO.setDescription(institution.getDescription());
            instituionDTO.setName(institution.getName());

            instituionDTOS.add(instituionDTO);
        }
        return instituionDTOS;

    }
}
