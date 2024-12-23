package com.company.petclinic.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "VET")
@Entity
public class Vet {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @JoinTable(name = "VET_SPECIALITY_LINK",
            joinColumns = @JoinColumn(name = "VET_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "SPECIALITY_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Speciality> specialities;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSpecialities(List<Speciality> specialities) {
        this.specialities = specialities;
    }

    public List<Speciality> getSpecialities() {
        return specialities;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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