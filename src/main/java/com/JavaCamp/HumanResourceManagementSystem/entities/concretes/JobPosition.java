package com.JavaCamp.HumanResourceManagementSystem.entities.concretes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jobpositions")
@NoArgsConstructor
public class JobPosition {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "positionName")
    private String positionName;

    public JobPosition(int id, String positionName){
        this.id = id;
        this.positionName = positionName;
    }


}
