package com.fitness.app.fitness.service;

import com.fitness.app.fitness.models.Exercise;
import com.fitness.app.fitness.models.ExerciseRecord;
import com.fitness.app.fitness.mappers.ExerciseMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ExerciseService {

    @Resource
    private ExerciseMapper exerciseMapper;

    public static final String COOKIE_NAME_TOKEN = "token";

    public Exercise getByToken(HttpServletResponse response, String token) {
        // to be added
        return new Exercise();
    }

    public Exercise getExerciseById(Integer userId){
        return exerciseMapper.getExerciseById(userId);
    }

    public ExerciseRecord getRecordById(Integer recordId){
        return exerciseMapper.getRecordById(recordId);
    }

    public List<Exercise> getAllExercises(){
        return exerciseMapper.getAllExercise();
    }

    public List<ExerciseRecord> getAllExerciseRecords(){
        return exerciseMapper.getAllExerciseRecords();
    }

 

    public void insertExercise(Exercise exercise)
    {
        exerciseMapper.insertExercise(exercise);
    }

    public void insertRecord(ExerciseRecord record)
    {
        exerciseMapper.insertRecord(record);
    }

    public void updateExercise(Exercise exercise)
    {
        exerciseMapper.updateExercise(exercise);
    }

    public void updateRecord(ExerciseRecord record)
    {
        exerciseMapper.updateRecord(record);
    }

    public void deleteExercise(Integer exerciseId)
    {
        exerciseMapper.deleteExercise(exerciseId);
    }

    public void deleteRecord(Integer recordId)
    {
        exerciseMapper.deleteRecord(recordId);
    }
}
