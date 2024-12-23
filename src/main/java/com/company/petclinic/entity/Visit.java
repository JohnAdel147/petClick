package com.company.petclinic.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "VISIT", indexes = {
        @Index(name = "IDX_VISIT_PET", columnList = "PET_ID"),
        @Index(name = "IDX_VISIT_ASSIGNED_NURSE", columnList = "ASSIGNED_NURSE_ID")
})
@Entity
public class Visit {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "PET_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Pet pet;

    @Column(name = "VISIT_DATE", nullable = false)
    @NotNull
    private LocalDateTime visitDate;

    @JoinColumn(name = "ASSIGNED_NURSE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User assignedNurse;

    @Column(name = "TYPE_", nullable = false)
    @NotNull
    private String type;

    @InstanceName
    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public void setStatus(TreatmentStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public TreatmentStatus getStatus() {
        return status == null ? null : TreatmentStatus.fromId(status);
    }

    public VisitType getType() {
        return type == null ? null : VisitType.fromId(type);
    }

    public void setType(VisitType type) {
        this.type = type == null ? null : type.getId();
    }

    public User getAssignedNurse() {
        return assignedNurse;
    }

    public void setAssignedNurse(User assignedNurse) {
        this.assignedNurse = assignedNurse;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
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