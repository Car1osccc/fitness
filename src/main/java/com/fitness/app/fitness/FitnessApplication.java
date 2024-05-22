package com.fitness.app.fitness;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
@MapperScan("com.fitness.app.fitness.mappers")
public class FitnessApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(FitnessApplication.class);
        Environment env = springApplication.run(args).getEnvironment();
        log.info("Fitness modules server has started : {}, CPU core : {}"
                , Arrays.toString(env.getActiveProfiles()), Runtime.getRuntime().availableProcessors());
    }

}
