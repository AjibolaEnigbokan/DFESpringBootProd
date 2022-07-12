package com.qa.dfespringbootProd.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.dfespringboot.entities.Customer;
import com.qa.dfespringbootProd.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
	
	List<Product> findProductByProductName(String productName);    // to implement further or what more things with ur API call custome quesries
	

}
