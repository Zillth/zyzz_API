package com.zyzz.test.services;

import java.util.ArrayList;
import java.util.Optional;

import com.zyzz.test.models.UserModel;
import com.zyzz.test.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    
    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel createUser(UserModel user){
        return userRepository.save(user);
    }

    public Optional<UserModel> getById(Long userId){
        return userRepository.findById(userId);
    }


    public ArrayList<UserModel>  getByType(Integer userType) {
        return userRepository.findByUserType(userType);
    }

    public ArrayList<UserModel>  getByEmail(String userEmail) {
        return userRepository.findByUserEmail(userEmail);
    }

    public boolean deleteUser(Long userId) {
        try{
            userRepository.deleteById(userId);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
