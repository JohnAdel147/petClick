package com.company.petclinic.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.UUID;

@JmixEntity
@Table(name = "SPECIALITY")
@Entity
public class Speciality {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "SPECILATY_NAME")
    private String specilatyName;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public String getSpecilatyName() {
        return specilatyName;
    }

    public void setSpecilatyName(String specilatyName) {
        this.specilatyName = specilatyName;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}