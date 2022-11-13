package com.example.btvnb2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class userModel {
    private int id ;
    private String username;
    private String email;
    private String password;
    private String avatar;



}
