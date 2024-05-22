package com.fitness.app.fitness.controller;

import org.springframework.web.bind.annotation.RestController;

import com.fitness.app.fitness.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import com.fitness.app.fitness.models.ApiResult;
import com.fitness.app.fitness.models.User;
import com.fitness.app.fitness.service.UserService;
import jakarta.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/123/{id}")
    public User test(@PathVariable("id") Integer id) {

        User user = userService.getUserById(id);
        return user;
    }

}
