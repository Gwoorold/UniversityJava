package edu.ntudp.olkhovyk.model;


import edu.ntudp.olkhovyk.model.base.Entity;
import edu.ntudp.olkhovyk.model.base.Head;

import java.util.ArrayList;
import java.util.Objects;

public class University extends Entity {
    private ArrayList<Faculty> faculties;

    public University(String name, Head head) {
        super(name, head);
        faculties = new ArrayList<>();
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        University that = (University) o;
        return Objects.equals(this.getName(), that.getName()) &&
                Objects.deepEquals(this.getHead(), that.getHead()) &&
                Objects.deepEquals(faculties, that.faculties);
    }
}


