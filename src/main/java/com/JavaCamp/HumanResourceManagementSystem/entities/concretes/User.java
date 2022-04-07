package com.JavaCamp.HumanResourceManagementSystem.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "created_at")
    private Date userDate;

    public User(int id, String email, String password, Date userDate){
        this.id = id;
        this.email = email;
        this.password = password;
        this.userDate = userDate;
    }
}
