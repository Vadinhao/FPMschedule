package com.company.model.entity.enums;

public enum Semester {
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4),
    FIFTH(5),
    SIXTH(6),
    SEVENTH(7),
    EIGHTH(8);

    private final int value;

    Semester (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
