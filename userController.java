package com.example.btvnb2.Controller;

import com.example.btvnb2.Model.userModel;
import com.example.btvnb2.Service.userService;
import com.example.btvnb2.reponse.userResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    @Autowired
    private userService userService;
    @PostMapping("/login")
    public userResponse login (@RequestBody userModel userModels){
        return userService.findByUserAndPassword(userModels.getUsername(),userModels.getPassword());
    }


}
