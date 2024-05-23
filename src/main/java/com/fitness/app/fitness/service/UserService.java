package com.fitness.app.fitness.service;

import com.fitness.app.fitness.models.User;
import com.fitness.app.fitness.mappers.UserMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Resource
    private UserMapper usermapper;

    public static final String COOKIE_NAME_TOKEN = "token";

    public User getByToken(HttpServletResponse response, String token) {
        // to be added
        return new User();
    }

    public User getUserById(Integer userId){
        return usermapper.getUserById(userId);
    }

    public List<User> getAllUser(){
        return usermapper.getAllUser();
    }

    public User verifyAccount(String userName, String password){
        return usermapper.verifyAccount(userName,password);
    }

    public void insertUser(User user)
    {
        usermapper.insertUser(user);
    }

    public void updateUser(User user)
    {
        usermapper.updateUser(user);
    }

    public void deleteUser(Integer userId)
    {
        usermapper.deleteUser(userId);
    }
}
