package com.systemmz.course.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.systemmz.course.entities.Order;
import com.systemmz.course.entities.User;
import com.systemmz.course.repositories.OrderRepository;
import com.systemmz.course.repositories.UserRepository;

@Configuration
@Profile("test")// para dizer que essa configuração é somente para ambiente(Perfil/profile) de teste
public class TesteConfig implements CommandLineRunner{

	@Autowired //para o spring poder fazer a dependencia do UserRepository
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	@Override
	
	public void run(String... args) throws Exception {
		
		User us1 = new User(null, "Mauricio Zaccaro", "neto.mauricio@unemat.br", "(66) 3439-5931", "M@uricio123");
		User us2 = new User(null, "Katia Neves", "katiagga@hotmail.com", "(66) 99944-2781", "123456");
		User us3 = new User(null, "Guilherme Gohan", "guilhermegohan@gmail.com", "(66) 99997-6284", "123456");
		User us4 = new User(null, "Neiri G", "neiriG@gmail.com@gmail.com", "(66) 99997-6284", "9874562");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), us1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), us2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), us1);
		Order o4 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), us1);
		
		userRepository.saveAll(Arrays.asList(us1, us2, us3, us4)); // para salvaar no bando H2
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o1));
	}
}
