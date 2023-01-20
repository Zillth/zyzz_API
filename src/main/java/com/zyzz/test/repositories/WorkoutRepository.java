package com.zyzz.test.repositories;

import java.util.ArrayList;

import com.zyzz.test.models.WorkoutModel;

import org.springframework.data.repository.CrudRepository;

public interface WorkoutRepository extends CrudRepository<WorkoutModel, Long> {
    public abstract ArrayList<WorkoutModel> findByWorkoutType(Integer workoutType);

}