package com.dbsdud.vaccineBlock.user.exception;

import com.dbsdud.vaccineBlock.common.error.ErrorCode;
import com.dbsdud.vaccineBlock.common.error.exception.InvalidValueException;
import com.dbsdud.vaccineBlock.user.model.Phone;

public class PhoneDuplicateException extends InvalidValueException {

    public PhoneDuplicateException(final Phone phone) {
        super(phone.getValue(), ErrorCode.PHONE_DUPLICATION);
    }
}
