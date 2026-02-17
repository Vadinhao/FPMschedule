package com.company.model.dao.impl;

import com.company.model.dao.FacultyDao;
import com.company.model.entity.Faculty;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public class FacultyDaoImpl implements FacultyDao {
    @Override
    public boolean add(Faculty entity) throws NamingException {
        return false;
    }

    @Override
    public Faculty getById(Long id) throws NamingException, SQLException {
        return null;
    }

    @Override
    public List<Faculty> getAll() throws NamingException, SQLException {
        return null;
    }

    @Override
    public boolean updateEntity(Faculty entity) throws NamingException {
        return false;
    }

    @Override
    public boolean deleteEntity(Long id) throws NamingException {
        return false;
    }
}
