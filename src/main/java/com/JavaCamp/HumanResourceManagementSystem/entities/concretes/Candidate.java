package com.JavaCamp.HumanResourceManagementSystem.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "candidates")
@NoArgsConstructor
public class Candidate extends User{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "identityNo")
    private String identifyNo;

    @Column(name = "yearOfBirth")
    private Date yearOfBirth;

    @Column(name = "user_id")
    private int userId;

    public Candidate(int id, String firstName, String lastName, String identifyNo, Date yearOfBirth, int userId){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identifyNo = identifyNo;
        this.yearOfBirth = yearOfBirth;
        this.userId = userId;

    }


}
