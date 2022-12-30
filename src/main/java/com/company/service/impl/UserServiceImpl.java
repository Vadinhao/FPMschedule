package com.company.service.impl;

import com.company.model.dao.factory.AbstractDaoFactory;
import com.company.model.entity.User;
import com.company.service.UserService;
import org.apache.log4j.Logger;

import javax.naming.NamingException;

public class UserServiceImpl implements UserService {

    private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

    private final AbstractDaoFactory daoFactory = AbstractDaoFactory.getInstance();

    @Override
    public User getUserByName(String name) throws NamingException {
        return null;
    }

    @Override
    public User getUserByEmail(String email) throws NamingException {
        return null;
    }

    @Override
    public boolean checkIfNameExists(String name) throws NamingException {
        return false;
    }

    @Override
    public boolean checkIfEmailExists(String name) throws NamingException {
        return false;
    }
}
