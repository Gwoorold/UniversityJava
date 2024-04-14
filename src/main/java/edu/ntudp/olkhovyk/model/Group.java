package edu.ntudp.olkhovyk.model;

import edu.ntudp.olkhovyk.model.base.Entity;
import edu.ntudp.olkhovyk.model.base.Head;

import java.util.ArrayList;
import java.util.Objects;

public class Group extends Entity {
    private ArrayList<Student> students;

    public Group(String name, Head head, ArrayList<Student> students) {
        super(name, head);
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Group that = (Group) o;
        return Objects.equals(this.getName(), that.getName()) &&
                Objects.deepEquals(this.getHead(), that.getHead()) &&
                Objects.deepEquals(getStudents(), that.getStudents());
    }
}

