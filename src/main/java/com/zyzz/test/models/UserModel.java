package com.zyzz.test.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long userId;

    private String userName;
    private String userSurname;
    private String userEmail;
    private String userPassword;
    private String userSex;
    private String userAdress;
    private String userImage;
    private Integer userAge;
    private String userPhone;
    private Double userHeight;
    private Double userWeight;
    private Integer userType;

    private String studentsIdList;
    private Integer yearsBeingCoach;
    private Integer coachNumberOfStudents;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    
    public Double getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(Double userHeight) {
        this.userHeight = userHeight;
    }

    public Double getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(Double userWeight) {
        this.userWeight = userWeight;
    }

    public void setUserType(Integer userType){
        this.userType = userType;
    }

    public Integer getUserType(){
        return userType;
    }

    public String getStudentsIdList() {
        return studentsIdList;
    }

    public void setStudentsIdList(String studentsIdList) {
        this.studentsIdList = studentsIdList;
    }

    public Integer getYearsBeingCoach() {
        return yearsBeingCoach;
    }

    public void setYearsBeingCoach(Integer yearsBeingCoach) {
        this.yearsBeingCoach = yearsBeingCoach;
    }

    public Integer getCoachNumberOfStudents() {
        return coachNumberOfStudents;
    }

    public void setCoachNumberOfStudents(Integer coachNumberOfStudents) {
        this.coachNumberOfStudents = coachNumberOfStudents;
    }
}
