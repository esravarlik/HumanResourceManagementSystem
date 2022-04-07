package com.JavaCamp.HumanResourceManagementSystem.api;

import com.JavaCamp.HumanResourceManagementSystem.business.abstracts.JobPositionService;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {

    private JobPositionService jobPositionsService;

    @Autowired
    public JobPositionsController(JobPositionService jobPositionsService) {
        super();
        this.jobPositionsService = jobPositionsService;
    }

    @GetMapping("/getall")
    public List<JobPosition> getAll(){
        return this.jobPositionsService.getAll();
    }
}
