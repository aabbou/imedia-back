package com.imedia.ecom.domain.service;

import java.util.List;

import com.imedia.ecom.domain.entities.Category;

public interface ICategoryService {

	Category createCategory(final Category p);
	Category updateCategory(final Category p);
	void deleteCategory(final Category p);
	Category getCategoryById(final Long id);
	void deleteCategoryById(final Long id);
	List<Category> getAllCategories();

}
