package com.qa.dfespringbootProd.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.dfespringbootProd.entities.Product;
import com.qa.dfespringbootProd.services.ProductService;

// Handle incoming HTTP requests and send responses
//uses JSON data
@RestController
@RequestMapping("/product") // add prefix to the urls
public class ProductController {

	private ProductService service;

	// Dependency Injection

	public ProductController(ProductService service) { // make a constructor of the CustomerController and pass it
														// CustomerService class of service as the input
		this.service = service;
	}

	// (GET - READ)
	@GetMapping("/readAll") // localhost :8080/product
	public List<Product> readAll() {
		return this.service.readAll();
	}

	@GetMapping("/readById/{id}") // id must match in the method.
	public Product readById(@PathVariable long id) {

		return this.service.readById(id);
	}

	@GetMapping("readByProductName/{productName}") // read By product name , to be implemented as stretch goal

	public List<Product> readByProductName(@PathVariable String productName) {

		return this.service.readByProductName(productName);
	}

	// Post -CREATE
	@PostMapping("/create") // localhost:8080/product/create

	public Product create(@RequestBody Product product) {
		// returns the latest entry added to the list
		return this.service.create(product); // gets the most recent entry of the arrayList

	}

	// ReadByID will be used in DataBase but cos we are using List Array we will use
	// index.

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable long id) {

		return this.service.delete(id);
	}

	// PUT -UPDATE

	@PutMapping("/update/{id}")
	public Product update(@PathVariable long id, @RequestBody Product product) {

		// add the updated product
		return this.service.update(id, product);

	}

}