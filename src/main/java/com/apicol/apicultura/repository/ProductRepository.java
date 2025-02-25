package com.apicol.apicultura.repository;

import com.apicol.apicultura.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface ProductRepository extends CrudRepository<Product, Long> {
}
