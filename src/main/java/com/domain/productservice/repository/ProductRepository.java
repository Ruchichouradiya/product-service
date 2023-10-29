package com.domain.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.domain.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
