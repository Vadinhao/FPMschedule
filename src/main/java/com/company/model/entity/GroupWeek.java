package com.company.model.entity;

import java.util.Objects;

public class GroupWeek extends AbstractEntity {

    private AcademicWeek academicWeek_1;
    private AcademicWeek academicWeek_2;
    private Group group;

    public GroupWeek() {

    }

    public AcademicWeek getAcademicWeek_1() {
        return academicWeek_1;
    }

    public void setAcademicWeek_1(AcademicWeek academicWeek_1) {
        this.academicWeek_1 = academicWeek_1;
    }

    public AcademicWeek getAcademicWeek_2() {
        return academicWeek_2;
    }

    public void setAcademicWeek_2(AcademicWeek academicWeek_2) {
        this.academicWeek_2 = academicWeek_2;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupWeek groupWeek = (GroupWeek) o;
        return Objects.equals(academicWeek_1, groupWeek.academicWeek_1) && Objects.equals(academicWeek_2, groupWeek.academicWeek_2) && Objects.equals(group, groupWeek.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(academicWeek_1, academicWeek_2, group);
    }

    @Override
    public String toString() {
        return "GroupWeek{" +
                "academicWeek_1=" + academicWeek_1 +
                ", academicWeek_2=" + academicWeek_2 +
                ", group=" + group +
                '}';
    }
}
