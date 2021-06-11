package com.dbsdud.vaccineBlock.user.exception;

import com.dbsdud.vaccineBlock.common.error.exception.EntityNotFoundException;

public class UserNotFoundException extends EntityNotFoundException {

    public UserNotFoundException(Long target) {
        super(target + " is not found");
    }
}
