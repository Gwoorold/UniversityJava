package edu.ntudp.olkhovyk.model;

import edu.ntudp.olkhovyk.model.base.Human;
import edu.ntudp.olkhovyk.model.base.Sex;

import java.util.Date;

public class Student extends Human {
    private int id;
    private Date birthday;

    public Student(String firstName, String lastName, String patronymic, Sex sex) {
        super(firstName, lastName, patronymic, sex);
    }

    public Student(int id, String firstName, String lastName, String patronymic, Date birthday) {
        super(firstName, lastName, patronymic);
        this.id = id;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public Date getBirthday() {
        return birthday;
    }
}
