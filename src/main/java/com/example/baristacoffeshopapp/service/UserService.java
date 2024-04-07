package com.example.baristacoffeshopapp.service;

import com.example.baristacoffeshopapp.model.entities.User;
import com.example.baristacoffeshopapp.model.service.UserServiceModel;
import com.example.baristacoffeshopapp.model.view.UserViewModel;

import java.util.List;

public interface UserService {
    boolean registerUser(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);

    void loginUser(Long id, String username);

    User findById(Long id);

    List<UserViewModel> findAllUsersAndCountOfOrdersOrderByCountDesc();
}
