package com.zyzz.test.services;

import java.util.ArrayList;
import java.util.Optional;

import com.zyzz.test.models.WorkoutModel;
import com.zyzz.test.repositories.WorkoutRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkoutService {
    @Autowired
    WorkoutRepository workoutRepository;
    
    public ArrayList<WorkoutModel> getWorkouts(){
        return (ArrayList<WorkoutModel>) workoutRepository.findAll();
    }

    public WorkoutModel createWorkout(WorkoutModel workout){
        return workoutRepository.save(workout);
    }

    public Optional<WorkoutModel> getById(Long workoutId){
        return workoutRepository.findById(workoutId);
    }


    public ArrayList<WorkoutModel>  getByType(Integer workoutType) {
        return workoutRepository.findByWorkoutType(workoutType);
    }

    public boolean deleteWorkout(Long workoutId) {
        try{
            workoutRepository.deleteById(workoutId);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}