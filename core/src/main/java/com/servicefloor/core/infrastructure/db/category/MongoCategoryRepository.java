package com.servicefloor.core.infrastructure.db.category;

import java.util.List;

import org.springframework.stereotype.Component;

import com.servicefloor.core.category.domain.Category;
import com.servicefloor.core.category.domain.CategoryRepository;

@Component("categoryRepository")
public class MongoCategoryRepository implements CategoryRepository {

	private static final String CATEGORY_COLLECTION = "categories";

	public void save(Category category) {

	}

	public Category findCategoryById(String categoryId) {
		return null;
	}

	public List<Category> findAllCategory() {
		return null;
	}

}
