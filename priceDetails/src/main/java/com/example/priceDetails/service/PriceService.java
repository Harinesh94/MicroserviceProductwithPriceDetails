package com.example.priceDetails.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.priceDetails.model.PriceDet;
import com.example.priceDetails.repository.PriceRepository;

@Service
@Transactional
public class PriceService {

	@Autowired
	private PriceRepository priceRepository;
	
	public PriceDet getPriceDetails(long id) {
		PriceDet priceDetails = priceRepository.findByproductId(id);		
		return priceDetails;
	}
}
