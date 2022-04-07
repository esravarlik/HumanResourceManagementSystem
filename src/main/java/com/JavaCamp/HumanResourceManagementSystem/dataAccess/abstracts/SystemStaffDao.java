package com.JavaCamp.HumanResourceManagementSystem.dataAccess.abstracts;


import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.SystemStaff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemStaffDao extends JpaRepository<SystemStaff, Integer> {
}
