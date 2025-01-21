package com.RealStore.demo.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RealStore.demo.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}

