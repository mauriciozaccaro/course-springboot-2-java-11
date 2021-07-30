package com.systemmz.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.systemmz.course.entities.Order;
import com.systemmz.course.repositories.OrderRepository;

@Service  // registra minha classe como um componente(serviço) do Spring para ser utilizado na injeção de dependencia com o @AutoWired
public class OrderService {
	
	@Autowired
	private OrderRepository repository; // dependência do OrderRepository
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj =  repository.findById(id);
		return obj.get(); // vai retornar o objeto "Order" que está no Optional
	}

}
