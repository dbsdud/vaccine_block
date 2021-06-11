package com.dbsdud.vaccineBlock.vaccine.dao;

import com.dbsdud.vaccineBlock.vaccine.domain.Vaccine;
import com.dbsdud.vaccineBlock.vaccine.model.Maker;
import com.dbsdud.vaccineBlock.vaccine.model.Serial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineRepository extends JpaRepository<Vaccine, Long> {
    boolean existsVaccine(Maker maker, Serial serial);
}
