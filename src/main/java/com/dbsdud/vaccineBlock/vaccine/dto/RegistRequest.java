package com.dbsdud.vaccineBlock.vaccine.dto;

import com.dbsdud.vaccineBlock.vaccine.domain.Vaccine;
import com.dbsdud.vaccineBlock.vaccine.model.Maker;
import com.dbsdud.vaccineBlock.vaccine.model.Serial;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class RegistRequest {

    @Valid private Maker maker;

    @Valid private Serial serial;

    RegistRequest(@Valid Maker maker, @Valid Serial serial) {
        this.maker = maker;
        this.serial = serial;
    }

    public Vaccine toEntity() {
        return Vaccine.builder()
                .maker(maker)
                .serial(serial)
                .build();
    }
}
