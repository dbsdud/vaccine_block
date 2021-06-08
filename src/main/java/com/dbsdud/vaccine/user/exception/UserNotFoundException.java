package com.dbsdud.vaccine.user.exception;

import com.dbsdud.vaccine.common.error.exception.EntityNotFoundException;

public class UserNotFoundException extends EntityNotFoundException {

    public UserNotFoundException(Long target) {
        super(target + " is not found");
    }
}
