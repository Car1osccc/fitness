package com.fitness.app.fitness.models;

import jakarta.validation.constraints.Email;
import lombok.Data;
import java.util.Date;

@Data
public class User {

    private Integer ID;

    private String Real_Name;

    private String password;

    @Email(message = "Invalid format")
    private String Email;

    private int Phone;

    private int Age;

    private String Gender;

    private int height;

    private int weight;

    private String Login_Name;

    private Date Submit_Date;

}
