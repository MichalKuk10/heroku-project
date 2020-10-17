package com.example.myprojectheroku.service;

import com.example.myprojectheroku.dao.UserRepository;
import com.example.myprojectheroku.model.User;

public class UserService {

    private UserRepository userRepository;


    public void addUser(User user) {

        userRepository.save(user);
    }

}
