package com.Blood_Donation_System.Blood_Donation_System.model;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Table(name="last_operations")
@EntityListeners(AuditingEntityListener.class)
public class LastOperationsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //public UsersModel user;
    private Date date;
    private String description;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
