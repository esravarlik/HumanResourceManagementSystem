package com.JavaCamp.HumanResourceManagementSystem.dataAccess.abstracts;

import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {
}
