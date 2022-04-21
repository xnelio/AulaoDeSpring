package com.devsuperior.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.model.Product;
import com.devsuperior.repository.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductResources {
	
	@Autowired
	private ProductRepository ProductRepository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = ProductRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = ProductRepository.findById(id).get();
		return ResponseEntity.ok().body(obj);
		
	}

	

}
