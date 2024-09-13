package com.mdtalalwasim.ecommerce.service;

import java.util.List;

import com.mdtalalwasim.ecommerce.entity.Category;

public interface CategoryService {
	
	public Category saveCategory(Category category);
	
	boolean existCategory(String categoryName);
	
	public List<Category> getAllCategories();

}