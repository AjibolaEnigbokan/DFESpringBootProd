package com.qa.dfespringbootProd.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	// defining  Table columns
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	@Column(nullable = false)
	private String productName;
	
	@Column(nullable = false)
	private double productPrice;
	
	@Column(nullable = false)
	private String productType;
	
	@Column(nullable = false)
	private String productColour;
	
	
	
	
}
