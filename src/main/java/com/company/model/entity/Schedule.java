package com.company.model.entity;

import java.util.Objects;

public class Schedule extends AbstractEntity {

    private int year;
    private int semester;
    private Faculty faculty;
    private String pathToSchedule;

    public Schedule() {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
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
        Schedule schedule = (Schedule) o;
        return year == schedule.year && semester == schedule.semester && Objects.equals(faculty, schedule.faculty) && Objects.equals(pathToSchedule, schedule.pathToSchedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, semester, faculty, pathToSchedule);
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "year=" + year +
                ", semester=" + semester +
                ", faculty=" + faculty +
                ", pathToSchedule='" + pathToSchedule + '\'' +
                '}';
    }
}
