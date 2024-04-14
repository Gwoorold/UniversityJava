package edu.ntudp.olkhovyk.model;

import edu.ntudp.olkhovyk.model.base.Human;
import edu.ntudp.olkhovyk.model.base.Sex;

public class Student extends Human {
    public Student(String firstName, String lastName, String patronymic, Sex sex) {
        super(firstName, lastName, patronymic, sex);
    }
}
