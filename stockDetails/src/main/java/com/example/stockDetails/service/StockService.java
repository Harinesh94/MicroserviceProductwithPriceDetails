package com.example.stockDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockDetails.model.StockDet;
import com.example.stockDetails.repository.StockRepository;

@Service
public class StockService {

	@Autowired
	private StockRepository stockRepository;
	
	public StockDet getStockDetails(long pId) {
		StockDet stockDet = stockRepository.findBypId(pId);		
		return stockDet;
	}
}
