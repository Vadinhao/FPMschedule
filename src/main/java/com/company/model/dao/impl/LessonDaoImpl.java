package com.company.model.dao.impl;

import com.company.model.dao.LessonDao;
import com.company.model.entity.Lesson;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public class LessonDaoImpl implements LessonDao {
    @Override
    public boolean add(Lesson entity) throws NamingException {
        return false;
    }

    @Override
    public Lesson getById(Long id) throws NamingException, SQLException {
        return null;
    }

    @Override
    public List<Lesson> getAll() throws NamingException, SQLException {
        return null;
    }

    @Override
    public boolean updateEntity(Lesson entity) throws NamingException {
        return false;
    }

    @Override
    public boolean deleteEntity(Long id) throws NamingException {
        return false;
    }
}
