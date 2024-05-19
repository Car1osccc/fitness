package com.fitness.app.fitness.dal;

import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class Exercise {

    private String exerciseId;

    private String exerciseName;

    private String category;

    private String description;

}
