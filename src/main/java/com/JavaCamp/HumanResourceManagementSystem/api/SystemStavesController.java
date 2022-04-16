package com.JavaCamp.HumanResourceManagementSystem.api;

import com.JavaCamp.HumanResourceManagementSystem.business.abstracts.SystemStaffService;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.DataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.Result;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.SystemStaff;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/systemstaff")
public class SystemStavesController {

    private SystemStaffService systemStaffService;

    @Autowired
    public SystemStavesController(SystemStaffService systemStaffService) {
        super();
        this.systemStaffService = systemStaffService;
    }

    @GetMapping("/getall")
    public DataResult<List<SystemStaff>> getAll(){
        return this.systemStaffService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody SystemStaff systemStaff){
        return this.systemStaffService.add(systemStaff);
    }
}
