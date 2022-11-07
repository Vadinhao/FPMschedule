package com.company.model.entity;

import java.util.Objects;

public class Subject extends AbstractEntity {

    private String name;
    private Speciality speciality;
    private Group group;
    private Teacher teacher;
    private int semester;
    private int lectureTime;
    private int practiceTime;
    private int labTime;
    private String lessonType;

    public Subject() {

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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getLectureTime() {
        return lectureTime;
    }

    public void setLectureTime(int lectureTime) {
        this.lectureTime = lectureTime;
    }

    public int getPracticeTime() {
        return practiceTime;
    }

    public void setPracticeTime(int practiceTime) {
        this.practiceTime = practiceTime;
    }

    public int getLabTime() {
        return labTime;
    }

    public void setLabTime(int labTime) {
        this.labTime = labTime;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return semester == subject.semester && lectureTime == subject.lectureTime && practiceTime == subject.practiceTime && labTime == subject.labTime && Objects.equals(name, subject.name) && Objects.equals(speciality, subject.speciality) && Objects.equals(group, subject.group) && Objects.equals(teacher, subject.teacher) && Objects.equals(lessonType, subject.lessonType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speciality, group, teacher, semester, lectureTime, practiceTime, labTime, lessonType);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", speciality=" + speciality +
                ", group=" + group +
                ", teacher=" + teacher +
                ", semester=" + semester +
                ", lectureTime=" + lectureTime +
                ", practiceTime=" + practiceTime +
                ", labTime=" + labTime +
                ", lessonType='" + lessonType + '\'' +
                '}';
    }
}
