package com.carlos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

}
