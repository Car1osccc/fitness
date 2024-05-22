package com.fitness.app.fitness.interceptor;

import jakarta.annotation.Resource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


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
