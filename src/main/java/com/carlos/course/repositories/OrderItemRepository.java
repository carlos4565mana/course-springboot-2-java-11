package com.carlos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

}
