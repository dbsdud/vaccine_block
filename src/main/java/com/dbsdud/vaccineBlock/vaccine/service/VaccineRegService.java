package com.dbsdud.vaccineBlock.vaccine.service;

import com.dbsdud.vaccineBlock.vaccine.dao.VaccineRepository;
import com.dbsdud.vaccineBlock.vaccine.domain.Vaccine;
import com.dbsdud.vaccineBlock.vaccine.dto.RegistRequest;
import com.dbsdud.vaccineBlock.vaccine.exception.VaccineDuplicateException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class VaccineRegService {
    private final VaccineRepository vaccineRepository;

    public Vaccine doRegist(final RegistRequest dto) {
        if(vaccineRepository.existsVaccine(dto.getMaker(), dto.getSerial())) {
            System.out.println("vaccine is exist");
        }
        return vaccineRepository.save(dto.toEntity());
    }
}
