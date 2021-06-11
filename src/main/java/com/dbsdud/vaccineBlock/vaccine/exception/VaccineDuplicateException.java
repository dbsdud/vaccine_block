package com.dbsdud.vaccineBlock.vaccine.exception;

import com.dbsdud.vaccineBlock.common.error.ErrorCode;
import com.dbsdud.vaccineBlock.common.error.exception.InvalidValueException;
import com.dbsdud.vaccineBlock.vaccine.model.Maker;
import com.dbsdud.vaccineBlock.vaccine.model.Serial;

public class VaccineDuplicateException extends InvalidValueException {

    public VaccineDuplicateException(final Maker maker, final Serial serial) {
        super(maker.getValue(), serial.getValue(), ErrorCode.VACCINE_DUPLICATION);
    }
}
