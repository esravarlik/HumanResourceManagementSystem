package com.JavaCamp.HumanResourceManagementSystem.business.abstracts;

import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.DataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.Result;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
    Result add(Employer employer);
}
