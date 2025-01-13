package com.example.baristacoffeshopapp.model.entities;

import com.example.baristacoffeshopapp.model.entities.enums.CategoryNameEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private CategoryNameEnum name;

    @Column(nullable = false)
    private Integer neededTime;
    public Category(CategoryNameEnum name, Integer neededTime) {
        this.name = name;
        this.neededTime = neededTime;
    }
}
