package com.jpacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpacourse.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
