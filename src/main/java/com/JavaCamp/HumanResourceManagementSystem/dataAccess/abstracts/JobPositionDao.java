package com.JavaCamp.HumanResourceManagementSystem.dataAccess.abstracts;

import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
}
