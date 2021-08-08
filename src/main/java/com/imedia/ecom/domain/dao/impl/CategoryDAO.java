package com.imedia.ecom.domain.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.imedia.ecom.domain.dao.ICategoryDAO;
import com.imedia.ecom.domain.entities.Category;
import com.imedia.ecom.repository.CategoryRepository;

@Component
public class CategoryDAO implements ICategoryDAO {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category createEntity(Category entity) {
		return categoryRepository.save(entity);
	}

	@Override
	public Category updateEntity(Category entity) {
		return categoryRepository.save(entity);
	}

	@Override
	public void deleteEntity(Category entity) {
		categoryRepository.delete(entity);

	}

	@Override
	public Category getEntityById(Long id) {
		return categoryRepository.getById(id);
	}

	@Override
	public void deleteEntityById(Long id) {
		categoryRepository.deleteById(id);

	}

	@Override
	public List<Category> getAll() {
		return categoryRepository.findAll();
	}

}
