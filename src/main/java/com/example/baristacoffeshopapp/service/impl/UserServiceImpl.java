package com.example.baristacoffeshopapp.service.impl;

import com.example.baristacoffeshopapp.model.entities.User;
import com.example.baristacoffeshopapp.model.service.UserServiceModel;
import com.example.baristacoffeshopapp.model.view.UserViewModel;
import com.example.baristacoffeshopapp.repository.UserRepository;
import com.example.baristacoffeshopapp.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.example.baristacoffeshopapp.sec.CurrentUser;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    private final CurrentUser currentUser;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.currentUser = currentUser;
    }

    @Override
    public UserServiceModel registerUser(UserServiceModel userServiceModel) {
User user = modelMapper.map(userServiceModel, User.class);

        return modelMapper.map(userRepository.save(user),UserServiceModel.class) ;
    }

    @Override
    public UserServiceModel findByUsernameAndPassword(String username, String password) {
        return  userRepository
                .findByUsernameAndPassword(username,password)
                .map(user ->
                    modelMapper.map(user,UserServiceModel.class))
                .orElse(null);

                }

    @Override
    public void loginUser(Long id, String username) {
currentUser.setId(id);
currentUser.setUsername(username);
    }

    @Override
    public User findById(Long id) {
        return userRepository
                .findById(id)
                .orElseThrow();
    }

    @Override
    public List<UserViewModel> findAllUsersAndCountOfOrdersOrderByCountDesc() {
        return userRepository
                .findAllByOrderCountDescending()
                .stream()
                .map(user -> {
                    UserViewModel userViewModel = new UserViewModel();
                    userViewModel.setUsername(user.getUsername());
                    userViewModel.setCountOfOrders(user.getOrders().size());

               return userViewModel;
                }).collect(Collectors.toList());
    }
}
//        User user = userRepository
//                .findByUsernameAndPassword(username, password);
//
//        if (user == null) {
//            return null;
//        }
//
//        return modelMapper.map(user, UserServiceModel.class);
//    }

