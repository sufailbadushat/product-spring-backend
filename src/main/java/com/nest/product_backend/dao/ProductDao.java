package com.nest.product_backend.dao;

import com.nest.product_backend.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer> {
}
