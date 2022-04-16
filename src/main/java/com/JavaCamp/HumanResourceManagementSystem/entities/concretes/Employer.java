package com.JavaCamp.HumanResourceManagementSystem.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "employers")
@NoArgsConstructor
public class Employer extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "website")
    private String website;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "created_at")
    private Date employerDate;

    @Column(name = "user_id")
    private int userId;

    public Employer(int id, String companyName, String website, String phoneNumber, Date employerDate, int userId){
        this.id = id;
        this.companyName = companyName;
        this.website = website;
        this.phoneNumber = phoneNumber;
        this.employerDate = employerDate;
        this.userId = userId;

    }

}
