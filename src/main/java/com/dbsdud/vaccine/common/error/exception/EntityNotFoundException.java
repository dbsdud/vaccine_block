package com.dbsdud.vaccine.common.error.exception;

import com.dbsdud.vaccine.common.error.ErrorCode;

public class EntityNotFoundException extends BusinessException {

    public EntityNotFoundException(String message) {
        super(message, ErrorCode.ENTITY_NOT_FOUND);
    }
}
