package com.servicefloor.main.category;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.servicefloor.core.category.dto.CategoryDto;
import com.servicefloor.core.category.manager.CategoryManager;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

	private static final Logger LOG = LoggerFactory
			.getLogger(CategoryController.class.getName());

	@Autowired
	CategoryManager categoryManager;

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public void addCategory(@RequestBody CategoryDto categoryDto) {
		LOG.info("Request to add new category " + categoryDto.toString());

		categoryManager.addCategory(categoryDto);
	}

	@RequestMapping(value = "/{categoryId}", method = RequestMethod.GET)
	public CategoryDto findCategoryById(@PathVariable String categoryId) {
		return categoryManager.findCategoryById(categoryId);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<CategoryDto> findAllCategory() {
		return categoryManager.findAllCategory();
	}

}
