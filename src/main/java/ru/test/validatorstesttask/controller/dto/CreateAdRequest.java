package ru.test.validatorstesttask.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import ru.test.validatorstesttask.business.dto.AdType;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CreateAdRequest {
    // не должно быть null или пустым
    private String theme;
    // не должно быть null или пустым
    private String text;
    // не должно быть null
    private AdType type;
    // не должно быть null
    private UUID categoryId;
    // если type == PAID, то не должно быть null (для проплаченных объявлений должен быть срок)
    private Long duration = null;
}