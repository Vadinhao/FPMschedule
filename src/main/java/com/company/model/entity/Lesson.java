package com.company.model.entity;

import java.util.Objects;

public class Lesson extends AbstractEntity {
    private Subject subject;
    private Classroom classroom;

    public Lesson() {
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return Objects.equals(subject, lesson.subject) && Objects.equals(classroom, lesson.classroom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, classroom);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "subject=" + subject +
                ", classroom=" + classroom +
                '}';
    }
}
