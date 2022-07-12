package com.qa.dfespringbootProd.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository {
	
	List<Product> findProductByProductName(String productName);    // to implement further to implement the stretch goal by searching for product by name. This is called the custom search	
	

}
