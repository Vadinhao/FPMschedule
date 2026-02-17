package com.company.model.dao.impl;

import com.company.model.dao.AcademicDayDao;
import com.company.model.entity.AcademicDay;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public class AcademicDayDaoImpl implements AcademicDayDao {
    @Override
    public boolean add(AcademicDay entity) throws NamingException {
        return false;
    }

    @Override
    public AcademicDay getById(Long id) throws NamingException, SQLException {
        return null;
    }

    @Override
    public List<AcademicDay> getAll() throws NamingException, SQLException {
        return null;
    }

    @Override
    public boolean updateEntity(AcademicDay entity) throws NamingException {
        return false;
    }

    @Override
    public boolean deleteEntity(Long id) throws NamingException {
        return false;
    }
}
