package com.JavaCamp.HumanResourceManagementSystem.business.concretes;

import com.JavaCamp.HumanResourceManagementSystem.business.abstracts.UserService;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.DataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.Result;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.SuccessDataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.SuccessResult;
import com.JavaCamp.HumanResourceManagementSystem.dataAccess.abstracts.UserDao;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data listed.");
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("User added.");
    }
}
