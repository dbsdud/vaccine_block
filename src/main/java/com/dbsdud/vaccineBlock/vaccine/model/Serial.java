package com.dbsdud.vaccineBlock.vaccine.model;


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
public class Serial {

    @Column(name = "serial")
    @NotEmpty
    private String value;

    private Serial(final String value) {
        this.value = value;
    }

    public static Serial of(final String value) {
        return new Serial(value);
    }
}
