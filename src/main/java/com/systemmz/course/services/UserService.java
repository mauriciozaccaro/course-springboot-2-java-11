package com.systemmz.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.systemmz.course.entities.User;
import com.systemmz.course.repositories.UserRepository;

@Service  // registra minha classe como um componente(serviço) do Spring para ser utilizado na injeção de dependencia com o @AutoWired
public class UserService {
	
	@Autowired
	private UserRepository repository; // dependência do UserRepository
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj =  repository.findById(id);
		return obj.get(); // vai retornar o objeto "User" que está no Optional
	}

}
