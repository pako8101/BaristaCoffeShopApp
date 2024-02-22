package com.example.baristacoffeshopapp.service;

import com.example.baristacoffeshopapp.model.entities.User;
import com.example.baristacoffeshopapp.model.service.UserServiceModel;

public interface UserService {
    UserServiceModel registerUser(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);

    void loginUser(Long id, String username);

    User findById(Long id);
}
