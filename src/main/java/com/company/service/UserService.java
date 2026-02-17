package com.company.service;

import com.company.model.entity.User;

import javax.naming.NamingException;

public interface UserService {

    User getUserByName(String name) throws NamingException;

    User getUserByEmail(String email) throws NamingException;

    boolean checkIfNameExists(String name) throws NamingException;

    boolean checkIfEmailExists(String name) throws NamingException;

}
