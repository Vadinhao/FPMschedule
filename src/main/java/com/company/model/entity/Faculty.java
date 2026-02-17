package com.company.model.entity;

import java.util.Objects;

public class Faculty extends AbstractEntity {

    private String name;
    private char letter;
    private String timetableCSV;

    public Faculty() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public String getTimetableCSV() {
        return timetableCSV;
    }

    public void setTimetableCSV(String timetableCSV) {
        this.timetableCSV = timetableCSV;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return letter == faculty.letter && Objects.equals(name, faculty.name) && Objects.equals(timetableCSV, faculty.timetableCSV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, letter, timetableCSV);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", letter=" + letter +
                ", timetableCSV='" + timetableCSV + '\'' +
                '}';
    }
}
