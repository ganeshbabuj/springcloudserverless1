package com.example.demo;

import com.example.demo.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class Springcloudserverless1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springcloudserverless1Application.class, args);
	}

	@Bean
	public Function<User, User> registerUser() {
		System.out.println("registerUser");
		return user -> {
			System.out.println("user: " + user);
			user.setStatus("REGISTERED");
			return user;
		};
	}
}
