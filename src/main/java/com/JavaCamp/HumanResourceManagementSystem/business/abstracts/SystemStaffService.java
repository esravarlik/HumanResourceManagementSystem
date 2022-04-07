package com.JavaCamp.HumanResourceManagementSystem.business.abstracts;

import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.SystemStaff;

import java.util.List;

public interface SystemStaffService {
    List<SystemStaff> getAll();
}
