package com.JavaCamp.HumanResourceManagementSystem.api;

import com.JavaCamp.HumanResourceManagementSystem.business.abstracts.JobPositionService;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.DataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.Result;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.JobPosition;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.SystemStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public DataResult<List<JobPosition>> getAll(){
        return this.jobPositionsService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobPosition jobPosition){
        return this.jobPositionsService.add(jobPosition);
    }
}
