package com.fitness.app.fitness.mappers;


import com.fitness.app.fitness.models.User;

public interface UserMapper {
    User getUserById(Integer userId);

    User verifyAccount(String userName, String password);

    Void insertUser(User user);
}
