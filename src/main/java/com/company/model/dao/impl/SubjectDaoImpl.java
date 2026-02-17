package com.company.model.dao.impl;

import com.company.model.dao.SubjectDao;
import com.company.model.entity.Subject;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public class SubjectDaoImpl implements SubjectDao {
    @Override
    public boolean add(Subject entity) throws NamingException {
        return false;
    }

    @Override
    public Subject getById(Long id) throws NamingException, SQLException {
        return null;
    }

    @Override
    public List<Subject> getAll() throws NamingException, SQLException {
        return null;
    }

    @Override
    public boolean updateEntity(Subject entity) throws NamingException {
        return false;
    }

    @Override
    public boolean deleteEntity(Long id) throws NamingException {
        return false;
    }
}
