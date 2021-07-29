package com.systemmz.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.systemmz.course.entities.User;
import com.systemmz.course.repositories.UserRepository;

@Configuration
@Profile("test")// para dizer que essa configuração é somente para ambiente de teste
public class TesteConfig implements CommandLineRunner{

	@Autowired //para o spring poder fazer a dependencia do UserRepository
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User us1 = new User(null, "Mauricio Zaccaro", "neto.mauricio@unemat.br", "(66) 3439-5931", "M@uricio123");
		User us2 = new User(null, "Katia Neves", "katiagga@hotmail.com", "(66) 99944-2781", "123456");
		User us3 = new User(null, "Guilherme Gohan", "guilhermegohan@gmail.com", "(66) 99997-6284", "123456");
		
		userRepository.saveAll(Arrays.asList(us1, us2, us3)); // para salvaar no bando H2
	}
}
