package com.jpacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpacourse.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
