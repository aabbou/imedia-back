package com.imedia.ecom.domain.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imedia.ecom.domain.dao.ICategoryDAO;
import com.imedia.ecom.domain.entities.Category;
import com.imedia.ecom.domain.service.ICategoryService;

@Service
@Transactional
public class CategoryService implements ICategoryService {

	@Autowired
	private ICategoryDAO categoryDao;

	@Override
	public Category createCategory(Category p) {
		return categoryDao.createEntity(p);
	}

	@Override
	public Category updateCategory(Category p) {
		return categoryDao.updateEntity(p);
	}

	@Override
	public void deleteCategory(Category p) {
		categoryDao.deleteEntity(p);
	}

	@Override
	public Category getCategoryById(Long id) {
		return categoryDao.getEntityById(id);
	}

	@Override
	public void deleteCategoryById(Long id) {
		categoryDao.deleteEntityById(id);

	}

	@Override
	public List<Category> getAllCategories() {
		return categoryDao.getAll();
	}

}
