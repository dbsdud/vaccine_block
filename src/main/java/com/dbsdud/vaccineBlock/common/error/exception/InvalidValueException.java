package com.dbsdud.vaccineBlock.common.error.exception;

import com.dbsdud.vaccineBlock.common.error.ErrorCode;

public class InvalidValueException extends BusinessException {

    public InvalidValueException(String value) {
        super(value, ErrorCode.INVALID_INPUT_VALUE);
    }

    public InvalidValueException(String value, ErrorCode errorCode) {
        super(value, errorCode);
    }

    public InvalidValueException(String value, String value1, ErrorCode errorCode) {
        super(value, value1, errorCode);
    }
}
