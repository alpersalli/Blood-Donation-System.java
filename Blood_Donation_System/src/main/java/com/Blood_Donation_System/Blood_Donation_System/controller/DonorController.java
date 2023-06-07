package com.Blood_Donation_System.Blood_Donation_System.controller;
import com.Blood_Donation_System.Blood_Donation_System.model.DonorModel;
import com.Blood_Donation_System.Blood_Donation_System.model.UsersModel;
import com.Blood_Donation_System.Blood_Donation_System.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DonorController {
    @Autowired
    private DonorService donorService;

    @GetMapping("/donor")
    public String getBecomeDonorPage(Model model){
        model.addAttribute("DonorRequest", new DonorModel());
        return "becomeDonor_page";
    }
    /* to save a donor */
    @PostMapping("/donor")
    public String createDonor(@ModelAttribute DonorModel donor) {
        System.out.println("Donor request: "+ donor);
        DonorModel registeredDonor=donorService.becomeDonor(donor.getDonor_name(), donor.getDonor_mobile(), donor.getDonor_age(), donor.getDonor_gender(), donor.getDonor_bloodGroup(), donor.getDonor_address());
        if (registeredDonor == null) {
            return "error_page";
        }else
            return "home_page";
    }

    /* get all donors */

    /* Delete a donor */




}
