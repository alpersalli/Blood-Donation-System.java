package com.Blood_Donation_System.Blood_Donation_System.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import java.util.Date;

@Entity
@Table(name="transportation")
@EntityListeners(AuditingEntityListener.class)
public class TransportationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transportation_id;
    private String transportation_type;
    private Date transportation_date;

    public Long getTransportation_id() {
        return transportation_id;
    }

    public void setTransportation_id(Long transportation_id) {
        this.transportation_id = transportation_id;
    }

    public String getTransportation_type() {
        return transportation_type;
    }

    public void setTransportation_type(String transportation_type) {
        this.transportation_type = transportation_type;
    }


    public Date getTransportation_date() {
        return transportation_date;
    }

    public void setTransportation_date(Date transportation_date) {
        this.transportation_date = transportation_date;
    }
}
