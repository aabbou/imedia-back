package com.imedia.ecom.domain.dao.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.imedia.ecom.domain.dao.IProductDAO;
import com.imedia.ecom.domain.entities.Category;
import com.imedia.ecom.domain.entities.Product;
import com.imedia.ecom.repository.CategoryRepository;
import com.imedia.ecom.repository.ProductRepository;

@Component
public class ProductDAO implements IProductDAO {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Product createEntity(Product entity) {
		Set<Category> categories = entity.getRelatedCategories();

		entity.setRelatedCategories(new HashSet<Category>());
		for (Category c : categories) {
			entity.addCategory(categoryRepository.getById(c.getId()));
		}

		return productRepository.save(entity);
	}

	@Override
	public Product updateEntity(Product entity) {
		productRepository.getById(entity.getId());
		Set<Category> categories = entity.getRelatedCategories();
		entity.setRelatedCategories(new HashSet<Category>());
		for (Category c : categories) {
			entity.addCategory(categoryRepository.getById(c.getId()));
		}

		return productRepository.save(entity);
	}

	@Override
	public void deleteEntity(Product entity) {
		productRepository.delete(entity);
	}

	@Override
	public Product getEntityById(Long id) {
		return productRepository.getById(id);
	}

	@Override
	public void deleteEntityById(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

}
