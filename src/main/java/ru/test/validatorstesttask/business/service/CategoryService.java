package ru.test.validatorstesttask.business.service;

import ru.test.validatorstesttask.business.dto.CategoryDto;
import ru.test.validatorstesttask.controller.dto.CreateCategoryRequest;

public interface CategoryService {
    CategoryDto create(CreateCategoryRequest request);
}
