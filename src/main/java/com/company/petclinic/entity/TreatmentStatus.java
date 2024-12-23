package com.company.petclinic.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum TreatmentStatus implements EnumClass<String> {

    UP_COMING("A"),
    IN_PROGRASS("B"),
    DONE("C");

    private final String id;

    TreatmentStatus(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TreatmentStatus fromId(String id) {
        for (TreatmentStatus at : TreatmentStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}