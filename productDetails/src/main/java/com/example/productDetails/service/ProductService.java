package com.example.productDetails.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productDetails.model.ProductInfo;
import com.example.productDetails.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public ProductInfo getProductInfobyId(long id) {
		Optional<ProductInfo> productInfo = productRepository.findById(id);
		
		if(productInfo.isPresent()) {
			return productInfo.get();
		}else {
			return null;
		}
	}
}
