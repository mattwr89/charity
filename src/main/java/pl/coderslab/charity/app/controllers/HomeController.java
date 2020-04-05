package pl.coderslab.charity.app.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.app.domain.entities.Institution;
import pl.coderslab.charity.app.domain.repositories.DonationRepository;
import pl.coderslab.charity.app.domain.repositories.InstitutionRepository;

import java.security.Principal;
import java.util.List;


@Controller
@RequestMapping("/") @Slf4j
public class HomeController {

    private final InstitutionRepository institutionRepository;
    private final DonationRepository donationRepository;

    public HomeController(InstitutionRepository institutionRepository, DonationRepository donationRepository) {
        this.institutionRepository = institutionRepository;
        this.donationRepository = donationRepository;
    }



    @GetMapping
    public String homeAction(Model model, Principal principal){
        String username = principal.getName();
        model.addAttribute("username",username);
        List<Institution> institutions = institutionRepository.findAll();
        model.addAttribute("institution" , institutions);
        Integer donations = donationRepository.countAllById();
        model.addAttribute("donations", donations);
        Integer sum = donationRepository.quantitySum();
        model.addAttribute( "sum", sum);



        return "index";
    }
}