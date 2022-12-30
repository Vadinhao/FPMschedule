package com.company.model.dao.impl;

import com.company.model.dao.TeacherDao;
import com.company.model.entity.Teacher;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public class TeacherDaoImpl implements TeacherDao {
    @Override
    public boolean add(Teacher entity) throws NamingException {
        return false;
    }

    @Override
    public Teacher getById(Long id) throws NamingException, SQLException {
        return null;
    }

    @Override
    public List<Teacher> getAll() throws NamingException, SQLException {
        return null;
    }

    @Override
    public boolean updateEntity(Teacher entity) throws NamingException {
        return false;
    }

    @Override
    public boolean deleteEntity(Long id) throws NamingException {
        return false;
    }
}
