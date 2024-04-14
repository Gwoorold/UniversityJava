package edu.ntudp.olkhovyk;

import edu.ntudp.olkhovyk.controller.UniversityCreator;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Unit test for simple App.
 */
public class JsonSerializerTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public JsonSerializerTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(JsonSerializerTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void test() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException {
        var json = new JsonSerializer();
        var oldUniversity = UniversityCreator.createTypicalUniversity();
        json.write(oldUniversity, "university.txt");
        var newUniversity = json.read("university.txt");

        assertEquals(oldUniversity, newUniversity);
    }
}
