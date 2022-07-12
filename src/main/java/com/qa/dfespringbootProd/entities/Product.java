package com.qa.dfespringbootProd.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	// define  Table columns
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	
	
	
}
