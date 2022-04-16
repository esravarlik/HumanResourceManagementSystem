package com.JavaCamp.HumanResourceManagementSystem.business.concretes;

import com.JavaCamp.HumanResourceManagementSystem.business.abstracts.JobPositionService;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.DataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.Result;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.SuccessDataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.SuccessResult;
import com.JavaCamp.HumanResourceManagementSystem.dataAccess.abstracts.JobPositionDao;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {

    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        super();
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Data listed.");
    }

    @Override
    public Result add(JobPosition jobPosition) {
        this.jobPositionDao.save(jobPosition);
        return new SuccessResult("JobPosition added.");
    }
}
