package edu.ntudp.olkhovyk.model;


import edu.ntudp.olkhovyk.model.base.Entity;
import edu.ntudp.olkhovyk.model.base.Head;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Faculty that = (Faculty) o;
        return Objects.equals(this.getName(), that.getName()) &&
                Objects.deepEquals(this.getHead(), that.getHead()) &&
                Objects.deepEquals(departments, that.getDepartments());
    }
}
