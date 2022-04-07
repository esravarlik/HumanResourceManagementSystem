package com.JavaCamp.HumanResourceManagementSystem.business.abstracts;

import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
}
