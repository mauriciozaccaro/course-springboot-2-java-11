package com.systemmz.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.systemmz.course.entities.User;
import com.systemmz.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired // injeção de dependencia automática
	private UserService service; // dependência para o UserService
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list); 
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){ /* esse pahtVariable é para poder "associar" o id que está 
	passando com o "/{id}" que será recebido ali na conexão */
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
