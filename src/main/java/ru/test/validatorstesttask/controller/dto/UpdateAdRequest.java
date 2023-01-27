package ru.test.validatorstesttask.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UpdateAdRequest {
    // должно быть не null
    private UUID id;
    // по крайней мере одно из 3 полей должно присутствовать
    private String newTheme = null;
    private String newText = null;
    private UUID newCategoryId = null;
}
