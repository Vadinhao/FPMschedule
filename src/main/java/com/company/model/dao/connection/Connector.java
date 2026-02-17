package com.company.model.dao.connection;

import org.apache.log4j.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Connector {
    private static final Logger logger =  Logger.getLogger(Connector.class);

    private static Connector pool;
    private final DataSource dataSource;


    private Connector() throws NamingException {
        Context initContext = new InitialContext();
        Context envContext = (Context) initContext.lookup("java:/comp/env");
        dataSource = (DataSource) envContext.lookup("jdbc/FMPSchedule"); //name of datasource in META-INF context.xml
    }

    public static synchronized Connector getInstance() throws NamingException {
        if (pool == null) {
            pool = new Connector();
        }
        return pool;
    }

    public Connection getConnection() throws SQLException {
        logger.info("Create connection");
        return dataSource.getConnection();
    }
}
