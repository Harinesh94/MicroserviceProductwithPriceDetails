package com.example.productDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.productDetails.model.PriceDet;
import com.example.productDetails.model.Product;
import com.example.productDetails.model.ProductInfo;
import com.example.productDetails.model.StockDet;
import com.example.productDetails.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/product/{id}")
	public Product getAllProductDetails(@PathVariable(value = "id") long id) {
		
		ProductInfo productInfo = getProductInfobyId(id);
		
		PriceDet priceDet = restTemplate.getForObject("http://localhost:8802/price/"+ id, PriceDet.class);		
		StockDet stockDet = restTemplate.getForObject("http://localhost:8803/stock/"+ id, StockDet.class);
		
		Product product = new Product(id, productInfo.getName(), productInfo.getDescription(), productInfo.getBrand(), priceDet.getPrice(), priceDet.getDiscountPrice(), priceDet.getOfferPercRate(), stockDet.isStockAvailable(), stockDet.isWarranty());
		
		return product;
		
	}
	
	public ProductInfo getProductInfobyId(long id) {
		return productService.getProductInfobyId(id);
	}
}
