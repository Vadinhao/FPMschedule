package com.company.model.dao.impl;

import com.company.model.dao.DepartmentDao;
import com.company.model.entity.Department;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {
    @Override
    public boolean add(Department entity) throws NamingException {
        return false;
    }

    @Override
    public Department getById(Long id) throws NamingException, SQLException {
        return null;
    }

    @Override
    public List<Department> getAll() throws NamingException, SQLException {
        return null;
    }

    @Override
    public boolean updateEntity(Department entity) throws NamingException {
        return false;
    }

    @Override
    public boolean deleteEntity(Long id) throws NamingException {
        return false;
    }
}
