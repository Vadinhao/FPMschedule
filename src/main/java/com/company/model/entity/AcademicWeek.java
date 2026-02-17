package com.company.model.entity;

import java.util.Arrays;
import java.util.Objects;

public class AcademicWeek extends AbstractEntity {

    private String typeOfWeek;
    private final AcademicDay[] academicDays = new AcademicDay[5];

    public String getTypeOfWeek() {
        return typeOfWeek;
    }

    public void setTypeOfWeek(String typeOfWeek) {
        this.typeOfWeek = typeOfWeek;
    }

    public AcademicDay[] getAcademicDays() {
        return academicDays;
    }

    public AcademicDay setAcademicDay(int index, AcademicDay academicDay) {
        if (index >= academicDays.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        AcademicDay deletedAcademicDay = academicDays[index];
        academicDays[index] = academicDay;
        return deletedAcademicDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcademicWeek that = (AcademicWeek) o;
        return Objects.equals(typeOfWeek, that.typeOfWeek) && Arrays.equals(academicDays, that.academicDays);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(typeOfWeek);
        result = 31 * result + Arrays.hashCode(academicDays);
        return result;
    }

    @Override
    public String toString() {
        return "AcademicWeek{" +
                "typeOfWeek='" + typeOfWeek + '\'' +
                ", academicDays=" + Arrays.toString(academicDays) +
                '}';
    }
}
