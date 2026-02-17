package com.company.model.entity.enums;

public enum DayOfWeek {
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fri");

    private final String value;

    DayOfWeek (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
