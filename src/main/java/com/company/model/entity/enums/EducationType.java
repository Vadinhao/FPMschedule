package com.company.model.entity.enums;

public enum EducationType {
    FULL_TIME("Full-time"),
    EVENING("Evening"),
    DISTANCE("Distance");

    private final String value;

    EducationType (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
