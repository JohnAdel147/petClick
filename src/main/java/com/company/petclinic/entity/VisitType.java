package com.company.petclinic.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum VisitType implements EnumClass<String> {

    REGULAR_CHECKUP("A"),
    RECHARGE("B"),
    STATUS_CONDITION_HEALING("C"),
    DISEASE_TREATMENT("D"),
    OTHER("E");

    private final String id;

    VisitType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static VisitType fromId(String id) {
        for (VisitType at : VisitType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}