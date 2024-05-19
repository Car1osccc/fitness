package com.fitness.app.fitness.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;


/**
 * @author Yihan Chen
 * @date 2023/2/1 15:53
 */
@RestController
@Slf4j
@RequestMapping("/login")
public class LoginController {
    @PostMapping("/test")
    public String test(){
        return "Success";
    }
}
