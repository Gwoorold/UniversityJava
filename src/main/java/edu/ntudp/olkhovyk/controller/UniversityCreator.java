package edu.ntudp.olkhovyk.controller;

import edu.ntudp.olkhovyk.model.University;

import java.lang.reflect.InvocationTargetException;

public class UniversityCreator {
    public static University createTypicalUniversity() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        var university = create("NTU");

        var faculty1 = FacultyCreator.create("Faculty 1");
        var faculty2 = FacultyCreator.create("Faculty 2");

        var dept1 = DepartmentCreator.create("Dept 1");
        var dept2 = DepartmentCreator.create("Dept 2");
        var dept3 = DepartmentCreator.create("Dept 3");

        var group1 = GroupCreator.create("Group 1", 9);
        var group2 = GroupCreator.create("Group 2", 7);
        var group3 = GroupCreator.create("Group 3", 10);
        var group4 = GroupCreator.create("Group 4", 4);
        var group5 = GroupCreator.create("Group 5", 3);
        var group6 = GroupCreator.create("Group 6", 5);

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        faculty1.addDepartment(dept1);
        faculty1.addDepartment(dept2);
        faculty2.addDepartment(dept3);

        dept1.addGroup(group1);
        dept1.addGroup(group2);
        dept2.addGroup(group3);
        dept2.addGroup(group4);
        dept3.addGroup(group5);
        dept3.addGroup(group6);

        return university;
    }

    public static University create(String name) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return new University(name, HumanCreator.createHead());
    }
}
