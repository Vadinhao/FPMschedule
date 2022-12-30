package com.company.model.dao.impl;

import com.company.model.dao.ScheduleDao;
import com.company.model.entity.Schedule;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public class ScheduleDaoImpl implements ScheduleDao {
    @Override
    public boolean add(Schedule entity) throws NamingException {
        return false;
    }

    @Override
    public Schedule getById(Long id) throws NamingException, SQLException {
        return null;
    }

    @Override
    public List<Schedule> getAll() throws NamingException, SQLException {
        return null;
    }

    @Override
    public boolean updateEntity(Schedule entity) throws NamingException {
        return false;
    }

    @Override
    public boolean deleteEntity(Long id) throws NamingException {
        return false;
    }
}
