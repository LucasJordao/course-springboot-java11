package com.jpacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpacourse.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
