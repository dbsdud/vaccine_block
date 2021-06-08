package com.dbsdud.vaccine.user.domain;

import com.dbsdud.vaccine.user.model.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@EqualsAndHashCode(of = {"id"})
@ToString(of = {"email", "name", "address", "phone", "idNumber"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "email", nullable = false, unique = true, updatable = false, length = 50))
    private Email email;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "name", nullable = false))
    private Name name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "addr_sido", column = @Column(name = "addr_sido", nullable = false)),
            @AttributeOverride(name = "addr_gugun", column = @Column(name = "addr_gugun", nullable = false)),
            @AttributeOverride(name = "addr_doro", column = @Column(name = "addr_doro", nullable = false)),
            @AttributeOverride(name = "addr_detail", column = @Column(name = "addr_detail", nullable = false))
    })
    private Address address;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "phone", nullable = false))
    private Phone phone;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "idNumber", nullable = false))
    private IdNumber idNumber;

    @CreationTimestamp
    @Column(name = "create_at", nullable = false, updatable = false)
    private LocalDateTime createAt;

    @UpdateTimestamp
    @Column(name = "udpate_at", nullable = false)
    private LocalDateTime updateAt;

    @Builder
    public User(Email email, Name name, Address address, Phone phone, IdNumber idNumber) {
        this.email = email;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.idNumber = idNumber;
    }

    public void updateProfile(final Name name) {
        this.name = name;
    }

}
