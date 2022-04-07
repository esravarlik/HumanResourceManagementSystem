package com.JavaCamp.HumanResourceManagementSystem.api;

import com.JavaCamp.HumanResourceManagementSystem.business.abstracts.SystemStaffService;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.SystemStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<SystemStaff> getAll(){
        return this.systemStaffService.getAll();
    }
}
