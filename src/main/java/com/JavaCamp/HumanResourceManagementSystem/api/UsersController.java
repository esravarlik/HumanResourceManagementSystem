package com.JavaCamp.HumanResourceManagementSystem.api;

import com.JavaCamp.HumanResourceManagementSystem.business.abstracts.UserService;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.DataResult;
import com.JavaCamp.HumanResourceManagementSystem.core.utilities.results.Result;
import com.JavaCamp.HumanResourceManagementSystem.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping("/getall")
    public DataResult<List<User>> getAll(){
        return this.userService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody User user){
        return this.userService.add(user);
    }

}
