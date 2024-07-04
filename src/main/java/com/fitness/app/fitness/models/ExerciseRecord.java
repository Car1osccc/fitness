package com.fitness.app.fitness.models;

import lombok.Data;

import java.util.Date;

@Data
public class ExerciseRecord {

    private Integer recordId;

    private Integer exerciseId;

    private Integer userId;

    private int count;

    private Date dateTime;

    private float score;

    private int durationTime;

}
