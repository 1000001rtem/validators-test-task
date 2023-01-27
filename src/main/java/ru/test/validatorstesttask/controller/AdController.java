package ru.test.validatorstesttask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.validatorstesttask.business.dto.AdDto;
import ru.test.validatorstesttask.business.service.AdService;
import ru.test.validatorstesttask.controller.dto.CreateAdRequest;
import ru.test.validatorstesttask.controller.dto.UpdateAdRequest;
import ru.test.validatorstesttask.util.validation.ValidationService;

@RestController
@RequestMapping("/api/v1/ad")
public class AdController {

    private final AdService adService;
    private final ValidationService validationService;

    @Autowired
    public AdController(AdService adService, ValidationService validationService) {
        this.adService = adService;
        this.validationService = validationService;
    }


    @PostMapping
    public AdDto create(CreateAdRequest request){
        validationService.validate(request);
        return adService.create(request);
    }

    @PutMapping
    public AdDto create(UpdateAdRequest request){
        validationService.validate(request);
        return adService.update(request);
    }
}
