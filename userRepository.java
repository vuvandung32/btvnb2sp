package com.example.btvnb2.Repository;

import com.example.btvnb2.DataBase.userData;
import com.example.btvnb2.Model.userModel;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class userRepository {
    public Optional<userModel> findByUserAndPassword (String username ,String password){
        return userData.userModels.stream().filter(userModel -> userModel.getUsername().equals(username) && userModel.getPassword().equals(password)).findFirst();
    }
}
