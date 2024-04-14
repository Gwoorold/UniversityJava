package edu.ntudp.olkhovyk;

import edu.ntudp.olkhovyk.model.Student;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentRepository {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/JavaUniversity";
    private static final String USER = "admin";
    private static final String PASSWORD = "admin";

    public static ArrayList<Student> getStudentsByMonth(int month) throws SQLException {
        var sql = "SELECT * FROM students WHERE MONTH(birthday) = " + month;
        var connection = DriverManager.getConnection(URL, USER, PASSWORD);
        var statement = connection.createStatement();
        var resultSet = statement.executeQuery(sql);

        var students = readStudentsList(resultSet);
        resultSet.close();
        statement.close();
        return students;
    }

    private static ArrayList<Student> readStudentsList(ResultSet resultSet) throws SQLException {
        var students = new ArrayList<Student>();
        while (resultSet.next()) {
            var id = resultSet.getInt("id");
            var firstName = resultSet.getString("first_name");
            var lastName = resultSet.getString("last_name");
            var patronymic = resultSet.getString("patronymic");
            var birthday = resultSet.getDate("birthday");
            var student = new Student(id, firstName, lastName, patronymic, birthday);
            students.add(student);
        }
        return students;
    }
}
