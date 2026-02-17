package com.company.model.dao.impl;

import com.company.model.dao.GroupWeekDao;
import com.company.model.entity.GroupWeek;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public class GroupWeekDaoImpl implements GroupWeekDao {
    @Override
    public boolean add(GroupWeek entity) throws NamingException {
        return false;
    }

    @Override
    public GroupWeek getById(Long id) throws NamingException, SQLException {
        return null;
    }

    @Override
    public List<GroupWeek> getAll() throws NamingException, SQLException {
        return null;
    }

    @Override
    public boolean updateEntity(GroupWeek entity) throws NamingException {
        return false;
    }

    @Override
    public boolean deleteEntity(Long id) throws NamingException {
        return false;
    }
}
