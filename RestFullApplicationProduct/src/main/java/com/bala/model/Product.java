package com.bala.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product_Tab")
public class Product {
	@Id
	@Column(name="pId")
	private Integer proId;
	@Column(name="pName")
	private String proName;
	private Double price;
	private String quality;
	private String description;
	public Product() {
		super();
	}
	public Product(Integer proId, String proName, Double price, String quality, String description) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.price = price;
		this.quality = quality;
		this.description = description;
	}
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", price=" + price + ", quality=" + quality
				+ ", description=" + description + "]";
	}}
