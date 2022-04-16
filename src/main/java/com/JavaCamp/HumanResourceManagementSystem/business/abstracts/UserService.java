package com.JavaCamp.HumanResourceManagementSystem.business.abstracts;

import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.DataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.Result;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.User;

import java.util.List;

public interface UserService {
    DataResult<List<User>> getAll();
    Result add(User user);
}
