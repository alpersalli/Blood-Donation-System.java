package com.Blood_Donation_System.Blood_Donation_System.controller;
import com.Blood_Donation_System.Blood_Donation_System.model.TransportationModel;
import com.Blood_Donation_System.Blood_Donation_System.service.TransportationService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class TransportationController {
    TransportationService transportService;

    @PostMapping("/transportation")
    public TransportationModel createTransport(@Validated @RequestBody TransportationModel transport) {

        return transportService.save(transport);
    }


    /* get all transport */
    @GetMapping("/transportation")
    public List<TransportationModel> getAllTransport() {
        System.out.println("getAll");
        return transportService.findAll();
    }

    /* Delete a product */

}
