package com.example.priceDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.priceDetails.model.PriceDet;

@Repository
public interface PriceRepository extends JpaRepository<PriceDet, Long> {

	PriceDet findByproductId(long productId);
}
