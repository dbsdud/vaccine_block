package com.dbsdud.vaccine.user.exception;

import com.dbsdud.vaccine.common.error.exception.EntityNotFoundException;

public class PhoneNotFoundException extends EntityNotFoundException {

    public PhoneNotFoundException(String target) {
        super(target + " is not found");
    }
}