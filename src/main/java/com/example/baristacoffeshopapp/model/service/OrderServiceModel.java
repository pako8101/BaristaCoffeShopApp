package com.example.baristacoffeshopapp.model.service;

import com.example.baristacoffeshopapp.model.entities.Category;
import com.example.baristacoffeshopapp.model.entities.CategoryNameEnum;
import com.example.baristacoffeshopapp.model.entities.User;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
public class OrderServiceModel {

    private Long Id;
    private String name;

    private String description;

    private BigDecimal price;

    private LocalDate orderTime;

    private CategoryNameEnum category;

    private User employee;
}
