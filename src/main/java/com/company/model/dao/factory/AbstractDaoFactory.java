package com.company.model.dao.factory;

import com.company.model.dao.*;

public abstract class AbstractDaoFactory {
    private static DaoFactory instance;

    public static synchronized DaoFactory getInstance() {
        if (instance == null) {
            instance = new DaoFactory();
        }
        return instance;
    }

    public abstract AcademicDayDao getAcademicDayDAO();

    public abstract AcademicWeekDao getAcademicWeekDAO();

    public abstract ClassroomDao getClassroomDAO();

    public abstract DepartmentDao getDepartmentDAO();

    public abstract FacultyDao getFacultyDAO();

    public abstract GroupDao getGroupDAO();

    public abstract GroupWeekDao getGroupWeekDAO();

    public abstract LessonDao getLessonDAO();

    public abstract ScheduleDao getScheduleDAO();

    public abstract SpecialityDao getSpecialityDAO();

    public abstract SubjectDao getSubjectDAO();

    public abstract TeacherDao getTeacherDAO();

    public abstract UserDao getUserDAO();

}
