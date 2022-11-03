package com.company.model.entity;

import java.util.Objects;

public class Department extends AbstractEntity {

    private String name;
    private Speciality speciality;

    public Department() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name) && Objects.equals(speciality, that.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speciality);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", speciality=" + speciality +
                '}';
    }
}
