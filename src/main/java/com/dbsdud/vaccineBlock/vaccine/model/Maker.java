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
public class Maker {

    @NotEmpty
    @Column(name = "maker")
    private String value;

    private Maker(final String value) {
        this.value = value;
    }

    public static Maker of(final String value) {
        return new Maker(value);
    }
}
