package com.example.baristacoffeshopapp.model.service;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserServiceModel {
    private Long Id;
    private String firstName;

    private String lastName;


    private String username;


    private String email;

    private String password;
}
