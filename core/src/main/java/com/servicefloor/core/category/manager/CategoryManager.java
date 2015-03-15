package com.servicefloor.core.category.manager;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.servicefloor.core.category.domain.Category;
import com.servicefloor.core.category.domain.CategoryRepository;
import com.servicefloor.core.category.dto.CategoryDto;

@Component
public class CategoryManager {

	private static final Logger LOG = LoggerFactory
			.getLogger(CategoryManager.class.getName());

	@Autowired
	private CategoryRepository categoryRepository;

	public void addCategory(CategoryDto categoryDto) {

	}

	public CategoryDto findCategoryById(String categoryId) {
		Category category = categoryRepository.findCategoryById(categoryId);
		return null;
	}

	public List<CategoryDto> findAllCategory() {
		List<Category> categories = categoryRepository.findAllCategory();
		return null;
	}

}
