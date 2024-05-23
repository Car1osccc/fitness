package com.fitness.app.fitness.controller;

import org.springframework.web.bind.annotation.RestController;

import com.fitness.app.fitness.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import com.fitness.app.fitness.models.ApiResult;
import com.fitness.app.fitness.models.User;
import jakarta.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    private UserService userService;
    

    @GetMapping("/get/{id}")
    public User test(@PathVariable("id") Integer id) {

        User user = userService.getUserById(id);
        return user;
    }

    @PutMapping("/update")
    public void test(@RequestBody User user) {

        userService.updateUser(user);
    
    }


    @GetMapping("/get")
    public List<User> getall() {

        List<User> user = userService.getAllUser();
        return user;
    }

    @PostMapping("/insert")
    public void insertUser(@RequestBody User user){

        userService.insertUser(user);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody String userId){

        userService.deleteUser(Integer.valueOf(userId));
    }

}
