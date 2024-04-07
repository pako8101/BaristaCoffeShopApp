package com.example.baristacoffeshopapp.repository;

import com.example.baristacoffeshopapp.model.entities.Category;
import com.example.baristacoffeshopapp.model.entities.enums.CategoryNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Optional<Category> findByName(CategoryNameEnum name);
}
