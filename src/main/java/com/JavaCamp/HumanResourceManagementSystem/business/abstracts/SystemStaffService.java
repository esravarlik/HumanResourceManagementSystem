package com.JavaCamp.HumanResourceManagementSystem.business.abstracts;

import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.DataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.Result;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.SystemStaff;

import java.util.List;

public interface SystemStaffService {
    DataResult<List<SystemStaff>> getAll();
    Result add(SystemStaff systemStaff);
}
