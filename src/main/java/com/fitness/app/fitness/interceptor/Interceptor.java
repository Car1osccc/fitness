package com.fitness.app.fitness.interceptor;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.nio.charset.StandardCharsets;



/**
 * 前端请求拦截器
 *
 * @author Yihan Chen
 * @date 2022/7/19 10:47
 */
@Slf4j
@Component
public class Interceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return false;
        }
//        for (Cookie cookie : cookies) {
//            if ("userToken".equals(cookie.getName())) {
//                String token = cookie.getValue();
//                String staffID = token.substring(0, token.length() / 2);
//                String code = token.substring(token.length() / 2);
//                byte[] staffIDByte = staffID.getBytes(StandardCharsets.UTF_8);
//                byte[] keyByte = "CarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarloscccCarlosccc".getBytes(StandardCharsets.UTF_8);
//                String verifyCode = new String(RC4Base(staffIDByte, keyByte));
//                return verifyCode.equals(code);
//            }
//        }
        return false;
    }
}
