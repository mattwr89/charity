package pl.coderslab.charity.app.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.app.controllers.dtos.CreateDonationRequest;
import pl.coderslab.charity.app.services.DonationService;

@Controller
@RequestMapping("/add") @Slf4j
public class DonationController {

    private final DonationService donationService;



    public DonationController(DonationService donationService) {

        this.donationService = donationService;
    }

    @GetMapping
    public String donationAdd(Model model){
        model.addAttribute("donationData", new CreateDonationRequest());
        return "donation/add";
    }

    @PostMapping
    public String processDonation(@ModelAttribute("donationData") CreateDonationRequest donationData, BindingResult result) {
        if (result.hasErrors()){
            return "donation/add";
        }

        donationService.donate(donationData);
        return "redirect:/";

    }
}
