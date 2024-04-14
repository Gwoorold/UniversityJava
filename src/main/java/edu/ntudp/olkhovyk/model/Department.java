package edu.ntudp.olkhovyk.model;

import edu.ntudp.olkhovyk.model.base.Entity;
import edu.ntudp.olkhovyk.model.base.Head;

import java.util.ArrayList;

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
}
