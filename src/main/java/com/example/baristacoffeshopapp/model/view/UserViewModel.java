package com.example.baristacoffeshopapp.model.view;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UserViewModel {
    private String username;
    private Integer countOfOrders;
}
