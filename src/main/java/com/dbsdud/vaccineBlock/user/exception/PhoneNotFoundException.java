package com.dbsdud.vaccineBlock.user.exception;

import com.dbsdud.vaccineBlock.common.error.exception.EntityNotFoundException;

public class PhoneNotFoundException extends EntityNotFoundException {

    public PhoneNotFoundException(String target) {
        super(target + " is not found");
    }
}
