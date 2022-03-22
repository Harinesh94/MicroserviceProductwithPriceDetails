package com.example.stockDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockDetails.model.StockDet;
import com.example.stockDetails.service.StockService;

@RestController
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	@RequestMapping("/stock/{pId}")
	public StockDet getStockDetByProductId(@PathVariable(value = "pId") long pId) {
		return stockService.getStockDetails(pId);
		
	}
}
