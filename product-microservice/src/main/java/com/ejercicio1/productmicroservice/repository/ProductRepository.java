package com.ejercicio1.productmicroservice.repository;

import com.ejercicio1.productmicroservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String>{

}
