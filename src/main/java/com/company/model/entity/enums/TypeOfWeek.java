package com.company.model.entity.enums;

public enum TypeOfWeek {
    NUMERATOR("Numerator"),
    DENOMINATOR("Denominator");

    private final String value;

    TypeOfWeek (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
