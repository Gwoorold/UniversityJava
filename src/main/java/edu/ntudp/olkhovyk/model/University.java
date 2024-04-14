package edu.ntudp.olkhovyk.model;


import edu.ntudp.olkhovyk.model.base.Entity;
import edu.ntudp.olkhovyk.model.base.Head;

import java.util.ArrayList;

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
}


