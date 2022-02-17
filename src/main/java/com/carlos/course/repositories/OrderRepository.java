package com.carlos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
