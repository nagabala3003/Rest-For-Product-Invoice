package com.bala.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bala.model.Product;
@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

}
