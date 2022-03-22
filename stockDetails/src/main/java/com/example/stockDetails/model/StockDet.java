package com.example.stockDetails.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class StockDet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sId;
	@Column
	private boolean stockAvailable;
	@Column
	private boolean warranty;
	@Column
	private long pId;
	public long getsId() {
		return sId;
	}
	public void setsId(long sId) {
		this.sId = sId;
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
	public long getpId() {
		return pId;
	}
	public void setpId(long pId) {
		this.pId = pId;
	}
	
	
}
