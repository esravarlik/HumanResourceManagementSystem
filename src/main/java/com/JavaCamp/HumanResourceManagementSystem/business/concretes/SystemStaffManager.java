package com.JavaCamp.HumanResourceManagementSystem.business.concretes;

import com.JavaCamp.HumanResourceManagementSystem.business.abstracts.SystemStaffService;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.DataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.Result;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.SuccessDataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.SuccessResult;
import com.JavaCamp.HumanResourceManagementSystem.dataAccess.abstracts.SystemStaffDao;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.SystemStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemStaffManager implements SystemStaffService {

    private SystemStaffDao systemStaffDao;

    @Autowired
    public SystemStaffManager(SystemStaffDao systemStaffDao) {
        super();
        this.systemStaffDao = systemStaffDao;
    }

    @Override
    public DataResult<List<SystemStaff>> getAll() {
        return new SuccessDataResult<List<SystemStaff>>(this.systemStaffDao.findAll(),"Data listed.");
    }

    @Override
    public Result add(SystemStaff systemStaff) {
        this.systemStaffDao.save(systemStaff);
        return new SuccessResult("Systemstaff added.");
    }
}
