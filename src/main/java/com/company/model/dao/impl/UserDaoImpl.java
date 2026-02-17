package com.company.model.dao.impl;

import com.company.model.dao.UserDao;
import com.company.model.entity.User;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean add(User entity) throws NamingException {
        return false;
    }

    @Override
    public User getById(Long id) throws NamingException, SQLException {
        return null;
    }

    @Override
    public List<User> getAll() throws NamingException, SQLException {
        return null;
    }

    @Override
    public boolean updateEntity(User entity) throws NamingException {
        return false;
    }

    @Override
    public boolean deleteEntity(Long id) throws NamingException {
        return false;
    }
}
