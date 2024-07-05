package com.fitness.app.fitness.controller;

import com.fitness.app.fitness.service.ExerciseService;

import org.springframework.web.bind.annotation.*;
import com.fitness.app.fitness.models.ApiResult;
import com.fitness.app.fitness.models.Exercise;
import com.fitness.app.fitness.models.ExerciseRecord;


import jakarta.annotation.Resource;

import java.util.List;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {
    @Resource
    private ExerciseService exerciseService;

    @GetMapping("/get/{id}")
    public ApiResult<Exercise> test(@PathVariable("id") Integer id) {
        Exercise exercise = exerciseService.getExerciseById(id);
        return ApiResult.ok(exercise);
    }

    @GetMapping("/getRecord/{id}")
    public ApiResult<ExerciseRecord> test1(@PathVariable("id") Integer id) {
        ExerciseRecord record = exerciseService.getRecordById(id);
        return ApiResult.ok(record);
    }

    @PostMapping("/update")
    public ApiResult updateExercise(@RequestBody Exercise exercise) {
        exerciseService.updateExercise(exercise);
        return ApiResult.ok();
    }

    @PostMapping("/updateRecord")
    public ApiResult updateRecord(@RequestBody ExerciseRecord record) {
        exerciseService.updateRecord(record);
        return ApiResult.ok();
    }

    @GetMapping("/get")
    public ApiResult<List<Exercise>> getall() {
        List<Exercise> exercises = exerciseService.getAllExercises();
        return ApiResult.ok(exercises);
    }
    @GetMapping("/getRecord")
    public ApiResult<List<ExerciseRecord>> getallR() {
        List<ExerciseRecord> records = exerciseService.getAllExerciseRecords();
        return ApiResult.ok(records);
    }

    @PostMapping("/insert")
    public ApiResult insertExercise(@RequestBody Exercise exercise) {
        exerciseService.insertExercise(exercise);
        return ApiResult.ok();
    }

    @PostMapping("/insertRecord")
    public ApiResult insertRecord(@RequestBody ExerciseRecord record) {
        exerciseService.insertRecord(record);
        return ApiResult.ok();
    }

    @PostMapping("/delete")
    public ApiResult deleteExercise(@RequestBody String exerciseId) {
        exerciseService.deleteExercise(Integer.valueOf(exerciseId));
        return ApiResult.ok();
    }
    @PostMapping("/deleteRecord")
    public ApiResult deleteExerciseRecord(@RequestBody String recordId) {
        exerciseService.deleteRecord(Integer.valueOf(recordId));
        return ApiResult.ok();
    }

   

}
