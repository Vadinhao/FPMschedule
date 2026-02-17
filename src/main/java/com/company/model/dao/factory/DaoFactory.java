package com.company.model.dao.factory;

import com.company.model.dao.*;
import com.company.model.dao.impl.*;
import org.apache.log4j.Logger;

public class DaoFactory extends AbstractDaoFactory {
    private static final Logger logger = Logger.getLogger(DaoFactory.class);

    private final AcademicDayDao academicDayDao = new AcademicDayDaoImpl();
    private final AcademicWeekDao academicWeekDao = new AcademicWeekDaoImpl();
    private final ClassroomDao classroomDao = new ClassroomDaoImpl();
    private final DepartmentDao departmentDao = new DepartmentDaoImpl();
    private final FacultyDao facultyDao = new FacultyDaoImpl();
    private final GroupDao groupDao = new GroupDaoImpl();
    private final GroupWeekDao groupWeekDao = new GroupWeekDaoImpl();
    private final LessonDao lessonDao = new LessonDaoImpl();
    private final ScheduleDao scheduleDao = new ScheduleDaoImpl();
    private final SpecialityDao specialityDao = new SpecialityDaoImpl();
    private final SubjectDao subjectDao = new SubjectDaoImpl();
    private final TeacherDao teacherDao = new TeacherDaoImpl();
    private final UserDao userDao = new UserDaoImpl();

    @Override
    public AcademicDayDao getAcademicDayDAO() {
        return academicDayDao;
    }

    @Override
    public AcademicWeekDao getAcademicWeekDAO() {
        return academicWeekDao;
    }

    @Override
    public ClassroomDao getClassroomDAO() {
        return classroomDao;
    }

    @Override
    public DepartmentDao getDepartmentDAO() {
        return departmentDao;
    }

    @Override
    public FacultyDao getFacultyDAO() {
        return facultyDao;
    }

    @Override
    public GroupDao getGroupDAO() {
        return groupDao;
    }

    @Override
    public GroupWeekDao getGroupWeekDAO() {
        return groupWeekDao;
    }

    @Override
    public LessonDao getLessonDAO() {
        return lessonDao;
    }

    @Override
    public ScheduleDao getScheduleDAO() {
        return scheduleDao;
    }

    @Override
    public SpecialityDao getSpecialityDAO() {
        return specialityDao;
    }

    @Override
    public SubjectDao getSubjectDAO() {
        return subjectDao;
    }

    @Override
    public TeacherDao getTeacherDAO() {
        return teacherDao;
    }

    @Override
    public UserDao getUserDAO() {
        return userDao;
    }
}
