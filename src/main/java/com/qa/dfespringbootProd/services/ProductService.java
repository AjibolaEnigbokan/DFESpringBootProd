package com.qa.dfespringbootProd.services;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	// here I will be using database instead of ArrayList for persistence
	
	private ProductRepo repo; // In order to link ProductService class with Repo, which must create a ProductREpo class and make it as variable for Productservice class
	
	public ProductService(ProductRepo repo) {  // I need to also create a constructor of ProductService class and make ProductRepo and an input in the contsructor
		
		
	}
	

}
