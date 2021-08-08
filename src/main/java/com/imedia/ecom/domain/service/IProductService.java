package com.imedia.ecom.domain.service;

import java.util.List;

import com.imedia.ecom.domain.entities.Product;

public interface IProductService {

	Product createProduct(final Product p);
	Product updateProduct(final Product p);
	void deleteProduct(final Product p);
	Product getProductById(final Long id);
	void deleteProductById(final Long id);
	List<Product> getAllProducts();

}
