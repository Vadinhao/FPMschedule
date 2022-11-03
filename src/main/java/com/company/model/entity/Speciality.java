package com.company.model.entity;

import java.util.Objects;

public class Speciality extends AbstractEntity {

    private String name;
    private String educationType;
    private char letter;
    private Faculty faculty;

    public Speciality() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducationType() {
        return educationType;
    }

    public void setEducationType(String educationType) {
        this.educationType = educationType;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speciality that = (Speciality) o;
        return letter == that.letter && Objects.equals(name, that.name) && Objects.equals(educationType, that.educationType) && Objects.equals(faculty, that.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, educationType, letter, faculty);
    }

    @Override
    public String toString() {
        return "Speciality{" +
                "name='" + name + '\'' +
                ", educationType='" + educationType + '\'' +
                ", letter=" + letter +
                ", faculty=" + faculty +
                '}';
    }
}
