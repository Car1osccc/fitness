package com.fitness.app.fitness.mappers;


import com.fitness.app.fitness.models.Exercise;
import com.fitness.app.fitness.models.ExerciseRecord;

public interface ExerciseMapper {
    ExerciseRecord getExerciseRecordById(Integer recordId);

    Exercise getExerciseById(Integer exerciseId);

    Void insertRecord(ExerciseRecord record);

    Void insertExercise(Exercise exercise);
}
