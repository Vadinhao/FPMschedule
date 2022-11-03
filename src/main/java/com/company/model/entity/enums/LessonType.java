package com.company.model.entity.enums;

public enum LessonType {
    LECTURE("Lecture"),
    PRACTICE("Practice"),
    LAB("Lab");

    private final String value;

    LessonType (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
