package com.JavaCamp.HumanResourceManagementSystem.business.abstracts;

import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.DataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.Result;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {
    DataResult<List<Candidate>> getAll();
    Result add(Candidate candidate);
}
