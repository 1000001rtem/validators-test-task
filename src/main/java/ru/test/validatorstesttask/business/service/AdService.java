package ru.test.validatorstesttask.business.service;

import ru.test.validatorstesttask.business.dto.AdDto;
import ru.test.validatorstesttask.controller.dto.CreateAdRequest;
import ru.test.validatorstesttask.controller.dto.UpdateAdRequest;

public interface AdService {
    AdDto create(CreateAdRequest request);

    AdDto update(UpdateAdRequest request);
}
