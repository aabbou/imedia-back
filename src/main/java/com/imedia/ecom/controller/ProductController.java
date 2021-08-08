package com.imedia.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imedia.ecom.domain.entities.Product;
import com.imedia.ecom.domain.service.IProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {

	@Autowired
	private IProductService productService;

	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@GetMapping("/get/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}

	@PostMapping
	public Product createNewProduct(@RequestBody Product p) {
		return productService.createProduct(p);
	}

	@PutMapping
	public Product updateExistingProduct(@RequestBody Product p) {
		return productService.updateProduct(p);
	}

	@DeleteMapping
	public void deleteProduct(@RequestBody Product p) {
		productService.deleteProduct(p);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteProductById(@PathVariable Long id) {
		productService.deleteProductById(id);
	}
}
