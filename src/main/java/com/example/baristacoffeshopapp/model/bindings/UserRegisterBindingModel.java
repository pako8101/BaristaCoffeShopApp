package com.example.baristacoffeshopapp.model.bindings;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@NoArgsConstructor
public class UserRegisterBindingModel {
    @Length(min = 3, max = 20, message = "The username must be between 3 and 20 characters")
    @NotBlank(message = "The field must not be empty")
    private String username;
    @NotBlank(message = "First name cannot be empty!")
    private String firstName;
    @Size(min = 2, max = 20)
    private String lastName;
    @Email(message = "Invalid email")
    @NotBlank(message = "The field must not be empty")
    private String email;
    @Length(min = 3, max = 20, message = "The password must be between 3 and 20 characters")
    @NotBlank(message = "The field must not be empty")
    private String password;
    @Length(min = 3, max = 20, message = "The password length must be between 3 and 20 characters")
    @NotBlank
    private String confirmPassword;

}
