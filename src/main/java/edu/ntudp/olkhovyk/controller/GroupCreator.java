package edu.ntudp.olkhovyk.controller;

import edu.ntudp.olkhovyk.model.Group;
import edu.ntudp.olkhovyk.model.Student;

import java.lang.reflect.InvocationTargetException;

public class GroupCreator {
    public static Group create(String name, int studentsCount) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return new Group(name, HumanCreator.createHead(), HumanCreator.create(Student.class, studentsCount));
    }
}
