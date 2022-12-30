package com.company.model.dao.impl;

import com.company.model.dao.ClassroomDao;
import com.company.model.entity.Classroom;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public class ClassroomDaoImpl implements ClassroomDao {
    @Override
    public boolean add(Classroom entity) throws NamingException {
        return false;
    }

    @Override
    public Classroom getById(Long id) throws NamingException, SQLException {
        return null;
    }

    @Override
    public List<Classroom> getAll() throws NamingException, SQLException {
        return null;
    }

    @Override
    public boolean updateEntity(Classroom entity) throws NamingException {
        return false;
    }

    @Override
    public boolean deleteEntity(Long id) throws NamingException {
        return false;
    }
}
