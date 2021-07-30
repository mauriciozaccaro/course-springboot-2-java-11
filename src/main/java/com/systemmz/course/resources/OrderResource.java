package com.systemmz.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.systemmz.course.entities.Order;
import com.systemmz.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired // injeção de dependencia automática
	private OrderService service; // dependência para o OrderService
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list); 
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){ /* esse pahtVariable é para poder "associar" o id que está 
	passando com o "/{id}" que será recebido ali na conexão */
		
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
