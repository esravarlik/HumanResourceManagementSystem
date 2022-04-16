package com.JavaCamp.HumanResourceManagementSystem.business.concretes;

import com.JavaCamp.HumanResourceManagementSystem.business.abstracts.EmployerService;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.DataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.Result;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.SuccessDataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.SuccessResult;
import com.JavaCamp.HumanResourceManagementSystem.dataAccess.abstracts.EmployerDao;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        super();
        this.employerDao = employerDao;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data listed.");
    }

    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("Employer added.");
    }
}
