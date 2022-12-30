package com.company.service;

import com.company.model.entity.Schedule;

import javax.naming.NamingException;

public interface ScheduleService {
    Schedule generateFirstIteration() throws NamingException;
    Schedule geneticAlgorithm() throws NamingException;
}
