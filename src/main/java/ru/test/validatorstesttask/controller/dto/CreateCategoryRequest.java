package ru.test.validatorstesttask.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CreateCategoryRequest {
    // не должно быть null или пустым
    private String categoryName;
}