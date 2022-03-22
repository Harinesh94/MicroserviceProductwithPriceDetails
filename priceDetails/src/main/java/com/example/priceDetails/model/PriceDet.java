package com.example.priceDetails.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PriceDet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long prid;
	@Column
	private double price;
	@Column
	private double discountPrice;
	@Column
	private double offerPercRate;
	@Column
	private long productId;
	public long getPrid() {
		return prid;
	}
	public void setPrid(long prid) {
		this.prid = prid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	public double getOfferPercRate() {
		return offerPercRate;
	}
	public void setOfferPercRate(double offerPercRate) {
		this.offerPercRate = offerPercRate;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	
	
}
