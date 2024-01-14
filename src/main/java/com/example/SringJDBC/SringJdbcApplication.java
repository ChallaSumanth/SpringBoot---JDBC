package com.example.SringJDBC;

import com.example.SringJDBC.model.Alien;
import com.example.SringJDBC.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SringJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SringJdbcApplication.class, args);

		Alien a1 = context.getBean(Alien.class);

		a1.setId(111);
		a1.setName("Sumanth");
		a1.setTech("Java");

		AlienRepo repo = context.getBean(AlienRepo.class);

		repo.save(a1);

		System.out.println(repo.findAll());

	}

}
