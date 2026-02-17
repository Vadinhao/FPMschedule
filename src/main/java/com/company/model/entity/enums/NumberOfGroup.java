package com.company.model.entity.enums;

public enum NumberOfGroup {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4);

    private final int value;

    NumberOfGroup (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
