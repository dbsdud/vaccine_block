package com.dbsdud.vaccine.user.exception;

import com.dbsdud.vaccine.common.error.ErrorCode;
import com.dbsdud.vaccine.common.error.exception.InvalidValueException;
import com.dbsdud.vaccine.user.model.Phone;

public class PhoneDuplicateException extends InvalidValueException {

    public PhoneDuplicateException(final Phone phone) {
        super(phone.getValue(), ErrorCode.PHONE_DUPLICATION);
    }
}
