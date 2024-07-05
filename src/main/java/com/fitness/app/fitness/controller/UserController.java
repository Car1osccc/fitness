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
    public ApiResult<User> test(@PathVariable("id") Integer id) {
        User user = userService.getUserById(id);
        return ApiResult.ok(user);
    }

    @PostMapping("/update")
    public ApiResult test(@RequestBody User user) {
        userService.updateUser(user);
        return ApiResult.ok();
    }

    @GetMapping("/get")
    public ApiResult<List<User>> getall() {
        List<User> users = userService.getAllUser();
        return ApiResult.ok(users);
    }

    @PostMapping("/insert")
    public ApiResult insertUser(@RequestBody User user) {
        userService.insertUser(user);
        return ApiResult.ok();
    }

    @PostMapping("/delete")
    public ApiResult deleteUser(@RequestBody String userId) {
        userService.deleteUser(Integer.valueOf(userId));
        return ApiResult.ok();
    }

}
