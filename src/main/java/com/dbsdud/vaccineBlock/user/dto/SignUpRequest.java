package com.dbsdud.vaccineBlock.user.dto;

import com.dbsdud.vaccineBlock.user.domain.User;
import com.dbsdud.vaccineBlock.user.model.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class SignUpRequest {

    @Valid private Email email;

    @Valid private Name name;

    @Valid private Address address;

    @Valid private Phone phone;

    @Valid private IdNumber idNumber;

    SignUpRequest(@Valid Email email, @Valid Name name, @Valid Address address, @Valid Phone phone, @Valid IdNumber idNumber) {
        this.email = email;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.idNumber = idNumber;
    }

    public User toEntity() {
        return User.builder()
                .email(email)
                .name(name)
                .address(address)
                .phone(phone)
                .idNumber(idNumber)
                .build();
    }

}
