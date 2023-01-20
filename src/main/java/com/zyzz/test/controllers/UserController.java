package com.zyzz.test.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.zyzz.test.models.UserModel;
import com.zyzz.test.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getUsers(){
        return userService.getUsers();
    }

    @PostMapping()
    public UserModel createUser(@RequestBody UserModel user){
        return this.userService.createUser(user);
    }

    @GetMapping( path = "/{userId}")
    public Optional<UserModel> getUserById(@PathVariable("userId") Long userId) {
        return this.userService.getById(userId);
    }

    @GetMapping("/query")
    public ArrayList<UserModel> getUserByType(@RequestParam("userType") Integer userType){
        return this.userService.getByType(userType);
    }

    @GetMapping(path = "/email/{userEmail}")
    public ArrayList<UserModel> getUserByEmail(@PathVariable("userEmail") String userEmail){
        return this.userService.getByEmail(userEmail);
    }

    @DeleteMapping( path = "/{userId}")
    public String deleteById(@PathVariable("userId") Long userId){
        boolean ok = this.userService.deleteUser(userId);
        if (ok){
            return "user was deleted, id: " + userId;
        }else{
            return "user was not deleted, id: " + userId;
        }
    }
    
}
