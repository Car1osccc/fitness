package com.fitness.app.fitness.dal;

import jakarta.validation.constraints.Email;
import lombok.Data;

import java.util.Date;

@Data
public class ExerciseRecord {

    private String recordId;

    private String exerciseId;

    private int count;

    private Date dateTime;

    private float score;

    private int durationTime;

}
