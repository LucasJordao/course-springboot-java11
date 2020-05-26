package com.jpacourse.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jpacourse.course.entities.Order;
import com.jpacourse.course.entities.User;
import com.jpacourse.course.entities.enums.OrderStatus;
import com.jpacourse.course.repositories.OrderRepository;
import com.jpacourse.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "senha");
		User u2 = new User(null, "Marcos Green", "marquinho@gmail.com", "988888888", "senha");
		
		Order o1 = new Order(null, Instant.parse("2020-06-20T19:57:01Z"), OrderStatus.WAITING_PAYMENT, u1);
		Order o2 = new Order(null, Instant.parse("2020-07-21T12:32:12Z"), OrderStatus.DELIVERED, u2);
		Order o3 = new Order(null, Instant.parse("2020-07-22T08:42:00Z"), OrderStatus.DELIVERED, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
	
}
