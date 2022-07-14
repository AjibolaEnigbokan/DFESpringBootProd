package com.qa.dfespringbootProd.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	// defining Table columns
	@Id //Setting the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto incrementing the Id column
	private long id;

	@Column(nullable = false)
	private String productName;

	@Column(nullable = false)
	private double productPrice;

	@Column(nullable = false)
	private String productType;

	@Column(nullable = false)
	private String productColour;

	// default constructor
	public Product() {
	}

	// constructor without ID
	public Product(String productName, double productPrice, String productType, String productColour) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productType = productType;
		this.productColour = productColour;
	}

	// constructor with ID
	public Product(long id, String productName, double productPrice, String productType, String productColour) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productType = productType;
		this.productColour = productColour;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductColour() {
		return productColour;
	}

	public void setProductColour(String productColour) {
		this.productColour = productColour;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, productColour, productName, productPrice, productType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && Objects.equals(productColour, other.productColour)
				&& Objects.equals(productName, other.productName)
				&& Double.doubleToLongBits(productPrice) == Double.doubleToLongBits(other.productPrice)
				&& Objects.equals(productType, other.productType);
	};

}
