package com.company.service.factory;

import com.company.service.ScheduleService;
import com.company.service.UserService;
import com.company.service.impl.ScheduleServiceImpl;
import com.company.service.impl.UserServiceImpl;
import org.apache.log4j.Logger;

public class ServiceFactory {
    private static final Logger logger = Logger.getLogger(ServiceFactory.class);

    private final UserService userService = new UserServiceImpl();
    private final ScheduleService scheduleService = new ScheduleServiceImpl();

    private static ServiceFactory instance;

    public static ServiceFactory getInstance() {
        if (instance == null) {
            logger.info("Create ServiceFactory");
            instance = new ServiceFactory();
        }
        return instance;
    }

    private ServiceFactory() {

    }

    public UserService getUserService() {
        logger.info("Get UserServiceImpl");
        return userService;
    }

    public ScheduleService getScheduleService() {
        logger.info("Get ScheduleServiceImpl");
        return scheduleService;
    }

}
