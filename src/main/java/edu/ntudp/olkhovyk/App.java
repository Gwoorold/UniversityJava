package edu.ntudp.olkhovyk;

import edu.ntudp.olkhovyk.controller.UniversityCreator;
import edu.ntudp.olkhovyk.model.Department;
import edu.ntudp.olkhovyk.model.Faculty;
import edu.ntudp.olkhovyk.model.Group;
import edu.ntudp.olkhovyk.model.University;
import edu.ntudp.olkhovyk.model.base.Human;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        var university = UniversityCreator.createTypicalUniversity();
        printUniversity(university);
    }

    private static void printUniversity(University university) {

        System.out.println("University name: " + university.getName());
        System.out.print("\tHead fullname: ");
        printHuman(university.getHead());
        System.out.println();
        ArrayList<Faculty> faculties = university.getFaculties();
        for (int i = 0; i < faculties.size(); i++) {
            System.out.print("\t");
            System.out.print((i + 1) + ". ");
            printFaculty(faculties.get(i));
            System.out.println();
        }
    }

    private static void printFaculty(Faculty faculty) {
        System.out.println("Faculty: " + faculty.getName());
        System.out.print("\t\tHead fullname: ");
        printHuman(faculty.getHead());
        System.out.println();
        ArrayList<Department> departments = faculty.getDepartments();
        for (int i = 0; i < departments.size(); i++) {
            System.out.print("\t\t");
            System.out.print((i + 1) + ". ");
            printDepartment(departments.get(i));
            System.out.println();
        }
    }

    private static void printDepartment(Department dept) {
        System.out.println("Department: " + dept.getName());
        System.out.print("\t\t\tHead fullname: ");
        printHuman(dept.getHead());
        System.out.println();
        ArrayList<Group> groups = dept.getGroups();
        for (int i = 0; i < groups.size(); i++) {
            System.out.print("\t\t\t");
            System.out.print((i + 1) + ". ");
            printGroup(groups.get(i));
            System.out.println();
        }
    }

    private static void printGroup(Group group) {
        System.out.println("Group: " + group.getName());
        System.out.print("\t\t\t\tHead fullname: ");
        printHuman(group.getHead());
        System.out.println();
        var students = group.getStudents();

        for (int i = 0; i < students.size(); i++) {
            System.out.print("\t\t\t\t");
            System.out.print((i + 1) + ". ");
            printHuman(students.get(i));
            System.out.println();
        }
    }

    private static void printHuman(Human human) {
        System.out.print(human.getFullName());
    }
}
