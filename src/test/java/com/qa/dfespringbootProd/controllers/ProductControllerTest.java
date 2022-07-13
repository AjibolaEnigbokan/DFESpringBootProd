package com.qa.dfespringbootProd.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.dfespringbootProd.entities.Product;

@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = { "classpath:testschema.sql",
		"classpath:testdata.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")
public class ProductControllerTest {
	@Autowired
	private MockMvc mvc; // used for sending mock request

	@Autowired
	private ObjectMapper mapper; // used for converting objects to JSON

	@Test
	public void readAllTest() throws Exception { // testing readAll method on the test ProductControllerTest

		List<Product> output = new ArrayList<>();

		Product entry = new Product(1L, "Apro", 40.0, "Yoghurt", "Yellow");
		output.add(entry);

		// Convert my expected output to JSON

		String outputAsJSON = mapper.writeValueAsString(output);
		mvc.perform(get("/product/readAll").contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().json(outputAsJSON));

	}

	@Test
	public void createTest() throws Exception { // create test method on the ProductControllerTest
		Product entry = new Product("Bombay Bag", 30.0, "HandBag", "Black");
		String entryAsJSON = mapper.writeValueAsString(entry);

		Product result = new Product(2L, "Bombay Bag", 30.0, "HandBag", "Black");
		String resultAsJSON = mapper.writeValueAsString(result);

		mvc.perform(post("/product/create").contentType(MediaType.APPLICATION_JSON).content(entryAsJSON))
				.andExpect(content().json(resultAsJSON));

	}

	@Test
	public void readByIdTest() throws Exception { // readByIdTest method on the ProductControllerTest
		Product entry = new Product(1L, "Apro", 40.0, "Yoghurt", "Yellow");
		String entryAsJSON = this.mapper.writeValueAsString(entry);

		mvc.perform(get("/product/readById/1").contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().json(entryAsJSON));
	}

	@Test
	public void updateTest() throws Exception { // running the updated test method on the Product controller class
		Product entry = new Product("Bombay Bag", 30.0, "HandBag", "Black");
		Product result = new Product(1L, "Bombay Bag", 30.0, "HandBag", "Yellow");// by replacing the colour of the
																					// product with yellow
		String entryAsJSON = this.mapper.writeValueAsString(entry);
		String resultAsJSON = this.mapper.writeValueAsString(result);

		mvc.perform(put("/product/update/1").contentType(MediaType.APPLICATION_JSON).content(entryAsJSON))
				.andExpect(content().json(resultAsJSON));

	}

	@Test
	public void deleteTest() throws Exception { // running the deleteTest method .
		mvc.perform(delete("/product/delete/1").contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().string("true"));
	}

}
