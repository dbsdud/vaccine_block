package com.dbsdud.vaccineBlock.vaccine.domain;

import com.dbsdud.vaccineBlock.vaccine.model.Maker;
import com.dbsdud.vaccineBlock.vaccine.model.Serial;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vaccine")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@EqualsAndHashCode(of = {"id"})
@ToString(of = {"maker", "serial"})
public class Vaccine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "maker", nullable = false, updatable = false))
    private Maker maker;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "serial", nullable = false, updatable = false))
    private Serial serial;

    @CreationTimestamp
    @Column(name = "create_at", nullable = false, updatable = false)
    private LocalDateTime createAt;

    @Builder
    public Vaccine(Maker maker, Serial serial) {
        this.maker = maker;
        this.serial = serial;
    }
}
