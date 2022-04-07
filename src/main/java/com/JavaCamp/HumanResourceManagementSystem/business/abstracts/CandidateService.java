package com.JavaCamp.HumanResourceManagementSystem.business.abstracts;

import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {
    List<Candidate> getAll();
}
