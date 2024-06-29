package com.fitness.app.fitness.controller;

import com.fitness.app.fitness.models.ApiResult;
import com.fitness.app.fitness.models.LoginVO;
import com.fitness.app.fitness.models.User;
import com.fitness.app.fitness.service.UserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


/**
 * @author Yihan Chen
 * @date 2023/2/1 15:53
 */
@RestController
@Slf4j
@RequestMapping("/login")
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping("/test")
    public String test() {
        return "Success";
    }

    @PostMapping("/verify")
    public ApiResult<User> verify(@RequestBody LoginVO loginVO) {
        User user = userService.verifyAccount(loginVO.getUserName(),loginVO.getPassword());
        if(user!=null){
            return ApiResult.ok(user);
        }else {
            return ApiResult.error("Invalid username or password");
        }
    }
}
