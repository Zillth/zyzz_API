package com.zyzz.test.repositories;

import java.util.ArrayList;

import com.zyzz.test.models.UserModel;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Long> {
    public abstract ArrayList<UserModel> findByUserType(Integer userType);

    public abstract ArrayList<UserModel> findByUserEmail(String userEmail);

}
