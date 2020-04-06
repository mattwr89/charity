package pl.coderslab.charity.app.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.app.domain.entities.Institution;
import pl.coderslab.charity.app.domain.repositories.DonationRepository;
import pl.coderslab.charity.app.domain.repositories.InstitutionRepository;
import pl.coderslab.charity.app.dtos.CategoryDTO;
import pl.coderslab.charity.app.dtos.InstituionDTO;
import pl.coderslab.charity.app.services.DonationService;

import java.security.Principal;
import java.util.List;


@Controller
@RequestMapping("/") @Slf4j
public class HomeController {

    private final DonationService donationService;

    public HomeController(DonationService donationService) {
        this.donationService = donationService;
    }

    @ModelAttribute("institutions")
    public List<InstituionDTO> institutions() {
        return donationService.availableInstitutions();
    }

    @ModelAttribute("categories")
    public List<CategoryDTO> categories() {
        return donationService.availableCategories();
    }


    @GetMapping
    public String homeAction(Model model, Principal principal){
        String username = principal.getName();
        model.addAttribute("username",username);
        model.addAttribute("institutions" , donationService.availableInstitutions());
        model.addAttribute("categories", donationService.availableCategories());
//        model.addAttribute( "sum", sum);
        return "index";
    }
}