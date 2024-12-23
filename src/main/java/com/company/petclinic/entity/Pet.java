package com.company.petclinic.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "PET", indexes = {
        @Index(name = "IDX_PET_OWNER", columnList = "OWNER_ID"),
        @Index(name = "IDX_PET_P_TYPE", columnList = "P_TYPE_ID")
})
@Entity
public class Pet {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "IDENTIFICATION_NUMBER", nullable = false, unique = true)
    private Integer identificationNumber;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "P_TYPE_ID")
    private PetType pType;

    @Column(name = "BIRTHDAY")
    private LocalDate birthday;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "OWNER_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Owner owner;

    public void setIdentificationNumber(Integer identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public Integer getIdentificationNumber() {
        return identificationNumber;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }



    public PetType getPType() {
        return pType;
    }

    public void setPType(PetType pType) {
        this.pType = pType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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