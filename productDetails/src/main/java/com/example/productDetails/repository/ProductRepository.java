package com.example.productDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productDetails.model.ProductInfo;

public interface ProductRepository extends JpaRepository<ProductInfo, Long>{
	
}
