package com.systemmz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.systemmz.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
