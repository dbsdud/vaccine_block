package com.dbsdud.vaccineBlock.user.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"addr_sido", "addr_gugun", "addr_doro", "addr_detail"})
public class Address {

    @NotEmpty
    @Column(name = "addr_sido", length = 20)
    private String addr_sido;

    @NotEmpty
    @Column(name = "addr_gugun", length = 20)
    private String addr_gugun;

    @NotEmpty
    @Column(name = "addr_doro", length = 20)
    private String addr_doro;

    @NotEmpty
    @Column(name = "addr_detail", length = 50)
    private String addr_detail;

    @Builder
    public Address(final String addr_sido, final String addr_gugun, final String addr_doro, final String addr_detail) {
        this.addr_sido = addr_sido;
        this.addr_gugun = addr_gugun;
        this.addr_doro = addr_doro;
        this.addr_detail = addr_detail;
    }

    public String getFullAddress() {
        return String.format("%s %s %s, %s", this.addr_sido, this.addr_gugun, this.addr_doro, this.addr_detail);
    }
}
