package com.zyzz.test.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.zyzz.test.models.WorkoutModel;
import com.zyzz.test.services.WorkoutService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/workout")
public class WorkoutController {
    @Autowired
    WorkoutService workoutService;

    @GetMapping()
    public ArrayList<WorkoutModel> getWorkouts(){
        return workoutService.getWorkouts();
    }

    @PostMapping()
    public WorkoutModel createWorkout(@RequestBody WorkoutModel workout){
        return this.workoutService.createWorkout(workout);
    }

    @GetMapping( path = "/{workoutId}")
    public Optional<WorkoutModel> getWorkoutById(@PathVariable("workoutId") Long workoutId) {
        return this.workoutService.getById(workoutId);
    }

    @GetMapping("/query")
    public ArrayList<WorkoutModel> getWorkoutByType(@RequestParam("workoutType") Integer workoutType){
        return this.workoutService.getByType(workoutType);
    }

    @DeleteMapping( path = "/{workoutId}")
    public String deleteById(@PathVariable("workoutId") Long workoutId){
        boolean ok = this.workoutService.deleteWorkout(workoutId);
        if (ok){
            return "workout was deleted, id: " + workoutId;
        }else{
            return "workout was not deleted, id: " + workoutId;
        }
    }
}
