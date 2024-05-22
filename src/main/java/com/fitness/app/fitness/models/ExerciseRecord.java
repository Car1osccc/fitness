package com.fitness.app.fitness.models;

import lombok.Data;

import java.util.Date;

@Data
public class ExerciseRecord {

    private Integer recordId;

    private String exerciseId;

    private int count;

    private Date dateTime;

    private float score;

    private int durationTime;

}
