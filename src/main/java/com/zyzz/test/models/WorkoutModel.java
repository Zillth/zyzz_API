package com.zyzz.test.models;

import jakarta.persistence.*;

@Entity
@Table(name = "workout")
public class WorkoutModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long workoutId;

    private String workoutName;
    private String workoutVideo;
    private String workoutBodyGoal;
    private Integer workoutType;

    public Long getWorkoutId() {
        return workoutId;
    }

    public void setUserId(Long workoutId) {
        this.workoutId = workoutId;
    }

    public String getWorkoutName() {
        return workoutName;
    }
    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }
    public String getWorkoutVideo() {
        return workoutVideo;
    }
    public void setWorkoutVideo(String workoutVideo) {
        this.workoutVideo = workoutVideo;
    }
    public String getWorkoutBodyGoal() {
        return workoutBodyGoal;
    }
    public void setWorkoutBodyGoal(String workoutBodyGoal) {
        this.workoutBodyGoal = workoutBodyGoal;
    }
    public Integer getWorkoutType() {
        return workoutType;
    }
    public void setWorkoutType(Integer workoutType) {
        this.workoutType = workoutType;
    }
    
}
