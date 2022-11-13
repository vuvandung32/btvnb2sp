package com.example.btvnb2.Service;

import com.example.btvnb2.Exception.userErrorMessage;
import com.example.btvnb2.Model.userModel;
import com.example.btvnb2.Repository.userRepository;
import com.example.btvnb2.reponse.userResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class userService {
    @Autowired
    private userRepository userRepository;


    public userResponse findByUserAndPassword (String username , String password){

        Optional<userModel> use = userRepository.findByUserAndPassword(username, password);
        if (use.isEmpty()){
            throw new userErrorMessage("username hoặc password chưa chính xác");
        }
        userResponse userResponses=new userResponse();
        userResponses.setUsername(use.get().getUsername());
        userResponses.setEmail(use.get().getEmail());
        userResponses.setAvatar(use.get().getAvatar());


        return userResponses ;


    }


}
