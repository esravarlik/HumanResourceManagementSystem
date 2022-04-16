package com.JavaCamp.HumanResourceManagementSystem.business.concretes;

import com.JavaCamp.HumanResourceManagementSystem.business.abstracts.CandidateService;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.DataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.Result;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.SuccessDataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.SuccessResult;
import com.JavaCamp.HumanResourceManagementSystem.dataAccess.abstracts.CandidateDao;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.Candidate;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.SystemStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;

    @Autowired
    public CandidateManager(CandidateDao candidateDao) {
        super();
        this.candidateDao = candidateDao;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"Data listed.");
    }

    @Override
    public Result add(Candidate candidate) {
        this.candidateDao.save(candidate);
        return new SuccessResult("Candidate added.");
    }
}
