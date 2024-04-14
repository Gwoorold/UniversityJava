package edu.ntudp.olkhovyk.model;


import edu.ntudp.olkhovyk.model.base.Entity;
import edu.ntudp.olkhovyk.model.base.Head;

import java.util.ArrayList;

public class Faculty extends Entity {
    private ArrayList<Department> departments;

    public Faculty(String name, Head head) {
        super(name, head);
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }
}
