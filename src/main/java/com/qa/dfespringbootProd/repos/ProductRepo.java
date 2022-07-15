package com.qa.dfespringbootProd.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.dfespringbootProd.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	List<Product> findProductByProductName(String productName); //  code to further implement the stretch goal by
																// searching for product by name. This is a 
																// custom search

}