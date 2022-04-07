package com.JavaCamp.HumanResourceManagementSystem.business.abstracts;

import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    List<Employer> getAll();
}
