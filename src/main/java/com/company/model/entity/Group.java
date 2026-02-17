package com.company.model.entity;

import java.util.Objects;

public class Group extends AbstractEntity {

    private Speciality speciality;
    private int year;
    private int numberOfGroup;
    private int numOfStudents;
    private String pathToSchedule;

    public Group() {

    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getPathToSchedule() {
        return pathToSchedule;
    }

    public void setPathToSchedule(String pathToSchedule) {
        this.pathToSchedule = pathToSchedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return year == group.year && numberOfGroup == group.numberOfGroup && numOfStudents == group.numOfStudents && Objects.equals(speciality, group.speciality) && Objects.equals(pathToSchedule, group.pathToSchedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speciality, year, numberOfGroup, numOfStudents, pathToSchedule);
    }

    @Override
    public String toString() {
        return "Group{" +
                "speciality=" + speciality +
                ", year=" + year +
                ", numberOfGroup=" + numberOfGroup +
                ", numOfStudents=" + numOfStudents +
                ", pathToSchedule='" + pathToSchedule + '\'' +
                '}';
    }
}
