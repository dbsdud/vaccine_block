package com.dbsdud.vaccineBlock.vaccine.controller;

import com.dbsdud.vaccineBlock.vaccine.domain.Vaccine;
import com.dbsdud.vaccineBlock.vaccine.dto.RegistRequest;
import com.dbsdud.vaccineBlock.vaccine.dto.VaccineResponse;
import com.dbsdud.vaccineBlock.vaccine.service.VaccineRegService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("vaccine")
@RequiredArgsConstructor
public class VaccineController {

    private final VaccineRegService vaccineRegService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public VaccineResponse create(@RequestBody @Valid final RegistRequest dto) {
        final Vaccine vaccine = vaccineRegService.doRegist(dto);
        return new VaccineResponse(vaccine);
    }
}
