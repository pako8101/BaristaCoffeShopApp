package com.example.baristacoffeshopapp.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "orders")
public class Order extends BaseEntity{

    @Column(nullable = false)
    private String name;
    @Column(nullable = false,columnDefinition = "TEXT")
    private String description;
    @Column
    private BigDecimal price;
    @Column
    @PastOrPresent
    private LocalDateTime orderTime;
    @ManyToOne
    private Category category;
    @ManyToOne
    private User employee;
}
