package com.Blood_Donation_System.Blood_Donation_System.controller;
import com.Blood_Donation_System.Blood_Donation_System.model.LastOperationsModel;
import com.Blood_Donation_System.Blood_Donation_System.service.Last_OperationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class LastOperationsController {
    @Autowired
    Last_OperationsService lastopService;

    /* get all admins */
    @GetMapping("/last_op")
    public List<LastOperationsModel> getAllOperations() {
        System.out.println("getAll");
        return lastopService.findAll();
    }

}
