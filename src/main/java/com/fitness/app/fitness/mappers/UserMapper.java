package com.fitness.app.fitness.mappers;


import java.util.List;

import com.fitness.app.fitness.models.User;

public interface UserMapper {
    User getUserById(Integer userId);

    List<User> getAllUser();

    User verifyAccount(String userName, String password);

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(Integer userId);
}
