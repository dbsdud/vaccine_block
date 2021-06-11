package com.dbsdud.vaccineBlock.vaccine.dto;

import com.dbsdud.vaccineBlock.vaccine.domain.Vaccine;
import com.dbsdud.vaccineBlock.vaccine.model.Maker;
import com.dbsdud.vaccineBlock.vaccine.model.Serial;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class VaccineResponse {
    private Maker maker;
    private Serial serial;

    public VaccineResponse(final Vaccine vaccine) {
        this.maker = vaccine.getMaker();
        this.serial = vaccine.getSerial();
    }
}
