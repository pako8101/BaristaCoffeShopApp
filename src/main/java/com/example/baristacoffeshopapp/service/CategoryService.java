package com.example.baristacoffeshopapp.service;

import com.example.baristacoffeshopapp.model.entities.Category;
import com.example.baristacoffeshopapp.model.entities.CategoryNameEnum;

public interface CategoryService {
    void initCategories();

    Category findByCategoryNameEnum(CategoryNameEnum categoryNameEnum);
}
