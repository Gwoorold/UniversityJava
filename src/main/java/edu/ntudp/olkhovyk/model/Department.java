package edu.ntudp.olkhovyk.model;

import edu.ntudp.olkhovyk.model.base.Entity;
import edu.ntudp.olkhovyk.model.base.Head;

import java.util.ArrayList;
import java.util.Objects;

public class Department extends Entity {
    private ArrayList<Group> groups;

    public Department(String name, Head head) {
        super(name, head);
        groups = new ArrayList<>();
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Department that = (Department) o;
        return Objects.equals(this.getName(), that.getName()) &&
                Objects.deepEquals(this.getHead(), that.getHead()) &&
                Objects.deepEquals(groups, that.getGroups());
    }
}
