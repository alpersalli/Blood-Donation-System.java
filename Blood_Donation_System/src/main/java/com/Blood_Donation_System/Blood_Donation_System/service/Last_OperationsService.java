package com.Blood_Donation_System.Blood_Donation_System.service;

import com.Blood_Donation_System.Blood_Donation_System.model.LastOperationsModel;
import com.Blood_Donation_System.Blood_Donation_System.repository.Last_OperationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Last_OperationsService {
    @Autowired
    Last_OperationsRepository lastopRepository;

    public LastOperationsModel save(LastOperationsModel lastop) {
        return lastopRepository.save(lastop);
    }

    public void delete(LastOperationsModel lastop) {
        lastopRepository.delete(lastop);
    }

    public List<LastOperationsModel> findAll(){
        return lastopRepository.findAll();
    }

}
