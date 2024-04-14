package edu.ntudp.olkhovyk.controller;

import edu.ntudp.olkhovyk.model.Faculty;

import java.lang.reflect.InvocationTargetException;

public class FacultyCreator {
    public static Faculty create(String name) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return new Faculty(name, HumanCreator.createHead());
    }

}
