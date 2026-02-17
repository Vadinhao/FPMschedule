package com.company.service.impl;

import com.company.model.dao.factory.AbstractDaoFactory;
import com.company.model.entity.Schedule;
import com.company.service.ScheduleService;
import org.apache.log4j.Logger;

import javax.naming.NamingException;

public class ScheduleServiceImpl implements ScheduleService {

    private static final Logger logger = Logger.getLogger(ScheduleServiceImpl.class);

    private final AbstractDaoFactory daoFactory = AbstractDaoFactory.getInstance();


    @Override
    public Schedule generateFirstIteration() throws NamingException {
        return null;
    }

    @Override
    public Schedule geneticAlgorithm() throws NamingException {
        return null;
    }
}
