package com.company.model.dao.impl;

import com.company.model.dao.SpecialityDao;
import com.company.model.entity.Speciality;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public class SpecialityDaoImpl implements SpecialityDao {
    @Override
    public boolean add(Speciality entity) throws NamingException {
        return false;
    }

    @Override
    public Speciality getById(Long id) throws NamingException, SQLException {
        return null;
    }

    @Override
    public List<Speciality> getAll() throws NamingException, SQLException {
        return null;
    }

    @Override
    public boolean updateEntity(Speciality entity) throws NamingException {
        return false;
    }

    @Override
    public boolean deleteEntity(Long id) throws NamingException {
        return false;
    }
}
