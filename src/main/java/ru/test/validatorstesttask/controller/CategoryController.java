package ru.test.validatorstesttask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.validatorstesttask.business.dto.AdDto;
import ru.test.validatorstesttask.business.dto.CategoryDto;
import ru.test.validatorstesttask.business.service.CategoryService;
import ru.test.validatorstesttask.controller.dto.CreateAdRequest;
import ru.test.validatorstesttask.controller.dto.CreateCategoryRequest;
import ru.test.validatorstesttask.util.validation.ValidationService;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final CategoryService categoryService;
    private final ValidationService validationService;

    @Autowired
    public CategoryController(CategoryService categoryService, ValidationService validationService) {
        this.categoryService = categoryService;
        this.validationService = validationService;
    }


    @PostMapping
    public CategoryDto create(CreateCategoryRequest request) {
        validationService.validate(request);
        return categoryService.create(request);
    }
}
