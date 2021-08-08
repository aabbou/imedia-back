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

import com.imedia.ecom.domain.entities.Category;
import com.imedia.ecom.domain.service.ICategoryService;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins = "*")
public class CategoryController {

	@Autowired
	private ICategoryService categoryService;

	@GetMapping
	public List<Category> getAllCategories() {
		return categoryService.getAllCategories();
	}

	@GetMapping("get/{id}")
	public Category getCategoryById(@PathVariable Long id) {
		return categoryService.getCategoryById(id);
	}

	@PostMapping
	public Category createNewCategory(@RequestBody Category p) {
		return categoryService.createCategory(p);
	}

	@PutMapping
	public Category updateExistingCategory(@RequestBody Category p) {
		return categoryService.updateCategory(p);
	}

	@DeleteMapping
	public void deleteCategory(@RequestBody Category p) {
		categoryService.deleteCategory(p);
	}

	@DeleteMapping("delete/{id}")
	public void deleteCategoryById(@PathVariable Long id) {
		categoryService.deleteCategoryById(id);
	}

}
