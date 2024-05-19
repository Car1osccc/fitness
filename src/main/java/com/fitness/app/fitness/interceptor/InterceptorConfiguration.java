package com.fitness.app.fitness.interceptor;

import com.fitness.app.fitness.dal.User;
import com.fitness.app.fitness.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.apache.commons.lang3.StringUtils;


public class InterceptorConfiguration implements WebMvcConfigurer {


    @Resource
    private Interceptor Interceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(Interceptor);
//                .excludePathPatterns("/login/*")
//                .excludePathPatterns("/dataInput/*");
    }

    public void setLoginContextInterceptor(Interceptor cookieInterceptor) {
        this.Interceptor = cookieInterceptor;
    }
}
