package com.imedia.ecom.domain.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imedia.ecom.domain.dao.IProductDAO;
import com.imedia.ecom.domain.entities.Product;
import com.imedia.ecom.domain.service.IProductService;

@Service
@Transactional
public class ProductService implements IProductService {

	@Autowired
	private IProductDAO productDao;

	@Override
	public Product createProduct(Product p) {
		return productDao.createEntity(p);
	}

	@Override
	public Product updateProduct(Product p) {
		return productDao.updateEntity(p);

	}

	@Override
	public void deleteProduct(Product p) {
		productDao.deleteEntity(p);
	}

	@Override
	public Product getProductById(Long id) {
		return productDao.getEntityById(id);
	}

	@Override
	public void deleteProductById(Long id) {
		productDao.deleteEntityById(id);

	}

	@Override
	public List<Product> getAllProducts() {
		return productDao.getAll();
	}

}
