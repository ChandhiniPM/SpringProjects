package com.chandhini.springboot.product;

import org.springframework.data.repository.CrudRepository;

import com.chandhini.springboot.product.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
