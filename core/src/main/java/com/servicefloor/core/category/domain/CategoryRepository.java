package com.servicefloor.core.category.domain;

import java.util.List;

public interface CategoryRepository {
	public void save(Category category);

	public Category findCategoryById(String categoryId);

	public List<Category> findAllCategory();
}
