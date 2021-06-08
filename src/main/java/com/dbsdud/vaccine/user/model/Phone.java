package com.dbsdud.vaccine.user.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"value"})
public class Phone {

    @Column(name = "phone")
    @NotEmpty
    private String value;

    private Phone(final String value) {
        this.value = value;
    }

    public static Phone of(final String value) {
        return new Phone(value);
    }
}
