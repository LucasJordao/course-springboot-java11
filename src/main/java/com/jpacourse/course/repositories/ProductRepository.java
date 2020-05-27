package com.jpacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpacourse.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
