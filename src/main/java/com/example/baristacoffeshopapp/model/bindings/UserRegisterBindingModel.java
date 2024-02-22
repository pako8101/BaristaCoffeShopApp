package com.example.baristacoffeshopapp.model.bindings;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRegisterBindingModel {
@Size(min = 5,max = 20)
    private String username;

    private String firstName;
    @Size(min = 5,max = 20)
    private String lastName;
    @Email
    private String email;
    @Size(min = 3)
    private String password;
    @Size(min = 3)
    private String confirmPassword;

}
