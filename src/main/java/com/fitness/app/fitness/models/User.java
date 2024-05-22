package com.fitness.app.fitness.models;

import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class User {

    private Integer userId;

    private String name;

    private String userName;

    private String password;

    @Email(message = "Invalid format")
    private String email;

    private String phone;

    private int age;

    private String gender;

    private float height;

    private float weight;

}
