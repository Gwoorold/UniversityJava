package edu.ntudp.olkhovyk.model;

import edu.ntudp.olkhovyk.model.base.Entity;
import edu.ntudp.olkhovyk.model.base.Head;

import java.util.ArrayList;

public class Group extends Entity {
    private ArrayList<Student> students;

    public Group(String name, Head head, ArrayList<Student> students) {
        super(name, head);
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}

