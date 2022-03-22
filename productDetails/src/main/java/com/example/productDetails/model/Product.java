package com.example.productDetails.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	
	
	public Product(long pid, String name, String description, String brand, double price, double discountPrice,
			double offerPercRate, boolean stockAvailable, boolean warranty) {
		super();
		this.pid = pid;
		this.name = name;
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.discountPrice = discountPrice;
		this.offerPercRate = offerPercRate;
		this.stockAvailable = stockAvailable;
		this.warranty = warranty;
	}
	
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
	public boolean isStockAvailable() {
		return stockAvailable;
	}
	public void setStockAvailable(boolean stockAvailable) {
		this.stockAvailable = stockAvailable;
	}
	public boolean isWarranty() {
		return warranty;
	}
	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	}

	private long pid;
	private String name;
	private String description;
	private String brand;
	private double price;
	private double discountPrice;
	private double offerPercRate;
	private boolean stockAvailable;
	private boolean warranty;
	
	
}
