package com.company.model.entity;

import java.util.Arrays;
import java.util.Objects;

public class AcademicDay extends AbstractEntity {

    private String dayOfWeek;
    private final Lesson[] lessons = new Lesson[5];

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Lesson[] getLessons() {
        return lessons;
    }

    public Lesson setLesson(int index, Lesson lesson) {
        if (index >= lessons.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Lesson deletedLesson = lessons[index];
        lessons[index] = lesson;
        return deletedLesson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcademicDay that = (AcademicDay) o;
        return Objects.equals(dayOfWeek, that.dayOfWeek) && Arrays.equals(lessons, that.lessons);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(dayOfWeek);
        result = 31 * result + Arrays.hashCode(lessons);
        return result;
    }

    @Override
    public String toString() {
        return "AcademicDay{" +
                "dayOfWeek='" + dayOfWeek + '\'' +
                ", lessons=" + Arrays.toString(lessons) +
                '}';
    }
}
