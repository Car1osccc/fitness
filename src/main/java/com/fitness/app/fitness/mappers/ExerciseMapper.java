package com.fitness.app.fitness.mappers;


import java.util.List;

import com.fitness.app.fitness.models.Exercise;
import com.fitness.app.fitness.models.ExerciseRecord;

public interface ExerciseMapper {
    ExerciseRecord getRecordById(Integer recordId);

    List<ExerciseRecord> getAllExerciseRecords();

    Exercise getExerciseById(Integer exerciseId);

    void insertRecord(ExerciseRecord record);

    void updateRecord(ExerciseRecord record);

    void deleteRecord(Integer record);

    void insertExercise(Exercise exercise);

    void deleteExercise(Integer exerciseId);

    void updateExercise(Exercise exercise);

    List<Exercise> getAllExercise();
}
