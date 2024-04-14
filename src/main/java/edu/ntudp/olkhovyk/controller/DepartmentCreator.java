package edu.ntudp.olkhovyk.controller;

import edu.ntudp.olkhovyk.model.Department;

import java.lang.reflect.InvocationTargetException;

public class DepartmentCreator {
    public static Department create(String name) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return new Department(name, HumanCreator.createHead());
    }
}
