package com.jpacourse.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jpacourse.course.entities.User;
import com.jpacourse.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "senha");
		User u2 = new User(null, "Marcos Green", "marquinho@gmail.com", "988888888", "senha");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
	
}
