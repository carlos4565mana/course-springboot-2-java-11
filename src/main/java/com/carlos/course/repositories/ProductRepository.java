package com.carlos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
