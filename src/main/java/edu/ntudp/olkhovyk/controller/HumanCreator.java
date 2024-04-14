package edu.ntudp.olkhovyk.controller;

import edu.ntudp.olkhovyk.model.Student;
import edu.ntudp.olkhovyk.model.base.Head;
import edu.ntudp.olkhovyk.model.base.Human;
import edu.ntudp.olkhovyk.model.base.Sex;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class HumanCreator {
    private static final Random random = new Random();

    public static Head createHead() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return create(Head.class);
    }

    public static Student createStudent() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return create(Student.class);
    }

    public static <THuman extends Human> THuman create(Class<THuman> tclass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        var firstName = UUID.randomUUID().toString();
        var lastName = UUID.randomUUID().toString();
        var patronymic = UUID.randomUUID().toString();
        var sex = random.nextBoolean() ? Sex.Male : Sex.Female;

        var result = tclass.getDeclaredConstructor(String.class, String.class, String.class, Sex.class)
                .newInstance(firstName, lastName, patronymic, sex);
        return result;
    }

    public static <THuman extends Human> ArrayList<THuman> create(Class<THuman> tclass, int count) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        var result = new ArrayList<THuman>(count);
        for (int i = 0; i < count; i++) {
            var head = create(tclass);
            result.add(head);
        }
        return result;
    }
}
