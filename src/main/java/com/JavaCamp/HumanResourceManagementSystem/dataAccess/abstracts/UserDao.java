package com.JavaCamp.HumanResourceManagementSystem.dataAccess.abstracts;

import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
