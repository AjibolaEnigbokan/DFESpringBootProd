package com.qa.dfespringbootProd.services;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	// here I will be using database instead of ArrayList for persistence
	
	private ProductRepo repo; // In order to link ProductService class with Repo, which must create a ProductREpo class and make it as variable for ProductService class
	
	public ProductService(ProductRepo repo) {  // I need to also create a constructor of ProductService class and make ProductRepo and an input in the constructor
			
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
