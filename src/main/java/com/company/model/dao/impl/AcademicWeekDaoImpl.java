package com.company.model.dao.impl;

import com.company.model.dao.AcademicWeekDao;
import com.company.model.entity.AcademicWeek;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public class AcademicWeekDaoImpl implements AcademicWeekDao{
    @Override
    public boolean add(AcademicWeek entity) throws NamingException {
        return false;
    }

    @Override
    public AcademicWeek getById(Long id) throws NamingException, SQLException {
        return null;
    }

    @Override
    public List<AcademicWeek> getAll() throws NamingException, SQLException {
        return null;
    }

    @Override
    public boolean updateEntity(AcademicWeek entity) throws NamingException {
        return false;
    }

    @Override
    public boolean deleteEntity(Long id) throws NamingException {
        return false;
    }
}
