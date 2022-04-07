package com.JavaCamp.HumanResourceManagementSystem.dataAccess.abstracts;

import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
}
