package com.JavaCamp.HumanResourceManagementSystem.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "systemstaff")
@NoArgsConstructor
public class SystemStaff extends User{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "created_at")
    private Date systemStaffDate;

    @Column(name = "user_id")
    private int userId;

    public SystemStaff(int id, String firstName, String lastName, Date systemStaffDate, int userId){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.systemStaffDate = systemStaffDate;
        this.userId = userId;
    }

}
