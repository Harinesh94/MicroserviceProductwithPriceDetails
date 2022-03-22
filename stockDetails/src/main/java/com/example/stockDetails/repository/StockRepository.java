package com.example.stockDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stockDetails.model.StockDet;


@Repository
public interface StockRepository extends JpaRepository<StockDet, Long>{
	
	StockDet findBypId(long pId);

}
