package com.jpacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpacourse.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
