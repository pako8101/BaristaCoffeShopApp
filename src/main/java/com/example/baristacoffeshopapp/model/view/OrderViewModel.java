package com.example.baristacoffeshopapp.model.view;

import com.example.baristacoffeshopapp.model.entities.Category;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.FutureOrPresent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@NoArgsConstructor
@Getter
@Setter
public class OrderViewModel {
    private Long Id;
    private String name;

    private BigDecimal price;


    private Category category;
}
