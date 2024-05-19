package com.fitness.app.fitness.service;

import com.fitness.app.fitness.dal.User;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public static final String COOKIE_NAME_TOKEN = "token";

    public User getByToken(HttpServletResponse response, String token) {
        // to be added
        return new User();
    }
}
