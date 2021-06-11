package com.dbsdud.vaccineBlock.user.model;

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
public class Name {

    @NotEmpty
    @Column(name = "name", length = 12)
    private String value;

    private Name(final String value) {
        this.value = value;
    }

    public static Name of(final String value) {
        return new Name(value);
    }
}
