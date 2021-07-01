package com.chandhini.springboot.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chandhini.springboot.product.ProductRepository;
import com.chandhini.springboot.product.entities.Product;

@RestController
@RequestMapping("/products")

public class ProductController {
	@Autowired
	ProductRepository repository;

	@GetMapping
	public Iterable<Product> getProducts() {
		return repository.findAll();

	}

	@PostMapping
	public Product createProducts(@RequestBody Product product) {

		return repository.save(product);
	}

	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return repository.save(product);

	}

	@DeleteMapping
	public void deleteProduct(int id) {
		repository.deleteById(id);

	}
}
