package com.company.model.dao.impl;

import com.company.model.dao.GroupDao;
import com.company.model.entity.Group;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public class GroupDaoImpl implements GroupDao {
    @Override
    public boolean add(Group entity) throws NamingException {
        return false;
    }

    @Override
    public Group getById(Long id) throws NamingException, SQLException {
        return null;
    }

    @Override
    public List<Group> getAll() throws NamingException, SQLException {
        return null;
    }

    @Override
    public boolean updateEntity(Group entity) throws NamingException {
        return false;
    }

    @Override
    public boolean deleteEntity(Long id) throws NamingException {
        return false;
    }
}
