package com.example.btvnb2.DataBase;

import com.example.btvnb2.Model.userModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class userData {

     public static    List <userModel>userModels = new ArrayList<>(List.of(
             new userModel(1,"vudung1","vdung567@gmail.com","a123","hello"),
             new userModel(2,"vudung2","vdung5@gmail.com","a1","hahaah"),
             new userModel(3,"vudung3","vdun7@gmail.com","a12","hahhehe")));


}
