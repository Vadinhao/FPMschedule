package com.company.model.entity;

import java.util.Objects;

public class Classroom extends AbstractEntity {

    private int number;
    private int sizeOfClassroom;
    private boolean isForLecture;
    private boolean isForPractice;
    private boolean isForLab;

    public Classroom() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSizeOfClassroom() {
        return sizeOfClassroom;
    }

    public void setSizeOfClassroom(int sizeOfClassroom) {
        this.sizeOfClassroom = sizeOfClassroom;
    }

    public boolean isForLecture() {
        return isForLecture;
    }

    public void setForLecture(boolean forLecture) {
        isForLecture = forLecture;
    }

    public boolean isForPractice() {
        return isForPractice;
    }

    public void setForPractice(boolean forPractice) {
        isForPractice = forPractice;
    }

    public boolean isForLab() {
        return isForLab;
    }

    public void setForLab(boolean forLab) {
        isForLab = forLab;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return number == classroom.number && sizeOfClassroom == classroom.sizeOfClassroom && isForLecture == classroom.isForLecture && isForPractice == classroom.isForPractice && isForLab == classroom.isForLab;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, sizeOfClassroom, isForLecture, isForPractice, isForLab);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "number=" + number +
                ", sizeOfClassroom=" + sizeOfClassroom +
                ", isForLecture=" + isForLecture +
                ", isForPractice=" + isForPractice +
                ", isForLab=" + isForLab +
                '}';
    }
}
