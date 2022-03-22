package com.example.priceDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.priceDetails.model.PriceDet;
import com.example.priceDetails.service.PriceService;

@RestController
public class PriceController {
	
	@Autowired
	private PriceService priceService;

	@RequestMapping("/price/{productId}")
	public PriceDet getPriceDetByProductId(@PathVariable(value = "productId") long productId) {
		return priceService.getPriceDetails(productId);
		
	}
	
}
