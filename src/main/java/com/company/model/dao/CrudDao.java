package com.company.model.dao;

import com.company.model.entity.AbstractEntity;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.List;

public interface CrudDao<L, E extends AbstractEntity> {

    boolean add(E entity) throws NamingException;

    E getById(L id) throws NamingException, SQLException;

    List<E> getAll() throws NamingException, SQLException;

    boolean updateEntity(E entity) throws NamingException;

    boolean deleteEntity(L id) throws NamingException;

}
