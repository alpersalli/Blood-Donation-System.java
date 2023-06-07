package com.Blood_Donation_System.Blood_Donation_System.service;
import com.Blood_Donation_System.Blood_Donation_System.model.TransportationModel;
import com.Blood_Donation_System.Blood_Donation_System.repository.TransportationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransportationService {
    @Autowired
    TransportationRepository transportRepository;

    public TransportationModel save(TransportationModel transport) {
        return transportRepository.save(transport);
    }



    public List<TransportationModel> findAll(){
        return transportRepository.findAll();
    }


}
