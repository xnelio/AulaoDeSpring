package com.devsuperior;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.model.Category;
import com.devsuperior.repository.CategoryRepository;

@SpringBootApplication
public class MyFirstProjectApplication implements CommandLineRunner{

	@Autowired
	private CategoryRepository catRepository; 
	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "eletronics");
		Category cat2 = new Category(2L, "books");
		
		catRepository.save(cat1);
		catRepository.save(cat2);
	}
	
	

}
