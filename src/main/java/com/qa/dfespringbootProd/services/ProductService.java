package com.qa.dfespringbootProd.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.dfespringbootProd.entities.Product;
import com.qa.dfespringbootProd.repos.ProductRepo;

@Service
public class ProductService {

	// here we will be using our database instead of Array list

	private ProductRepo repo;

	public ProductService(ProductRepo repo) {

		this.repo = repo;
	}

	// (GET - READ)
	// ReadAll

	public List<Product> readAll() {

		return this.repo.findAll();
	}

	// ReadByID will be used in DataBase but cos we are using List Array we will use
	// index.

	public Product readById(long id) {

		return this.repo.findById(id).get();
	}

	public List<Product> readByProductName(String productName) { // ReadByProductName this is a custom search to
																	// implement the stretch goal
		return this.repo.findProductByProductName(productName);
	}

	// Post -CREATE

	public Product create(Product product) {
		return this.repo.saveAndFlush(product);
	}

	// PUT -UPDATE

	public Product update(long id, Product product) {

		// 1-we need to get existing entry
		Product existingProduct = this.repo.findById(id).get();
		// 2- Change the existing entry , using our new object above

		existingProduct.setProductName(product.getProductName());
		existingProduct.setProductPrice(product.getProductPrice());
		existingProduct.setProductType(product.getProductType());
		// save the product entry back into the database
		return this.repo.saveAndFlush(existingProduct);

	}

	// DELETE - DELETE

	public boolean delete(long id) {

		this.repo.deleteById(id);
		return !this.repo.existsById(id); // existsById sHould be false but must be flipped or invert to make it true.
	}

}
