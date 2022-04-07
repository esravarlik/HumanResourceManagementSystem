package com.JavaCamp.HumanResourceManagementSystem.business.concretes;

import com.JavaCamp.HumanResourceManagementSystem.business.abstracts.CandidateService;
import com.JavaCamp.HumanResourceManagementSystem.dataAccess.abstracts.CandidateDao;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;

    @Autowired
    public CandidateManager(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    @Override
    public List<Candidate> getAll() {
        return candidateDao.findAll();
    }
}
