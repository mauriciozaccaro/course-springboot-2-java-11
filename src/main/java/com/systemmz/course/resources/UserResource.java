package com.systemmz.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.systemmz.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User us = new User(1L, "Mauricio", "testandoconexao@unemat.br", "(66) 99944-2781", "M@uricio123");
		return ResponseEntity.ok().body(us);
	}
}
