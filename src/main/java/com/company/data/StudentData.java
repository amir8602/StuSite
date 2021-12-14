package com.company.data;

import com.company.ui.models.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentData {

    public void save(Student student) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stusite", "root", "1995");
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student (name , family , college) VALUES (?,?,?) ");
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getFamily());
        preparedStatement.setString(3, student.getCollege());
        preparedStatement.executeUpdate();


    }

    public List<Student> getAll() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stusite", "root", "1995");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
        List<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            Student student = new Student(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
            students.add(student);

        }
        return students;
    }

    public Student getStudent(Integer id) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stusite", "root", "1995");
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student WHERE id=?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        Integer id1 = resultSet.getInt(1);
        String name = resultSet.getString(2);
        String family = resultSet.getString(3);
        String college = resultSet.getString(4);
        Student student = new Student(id,name,family,college);
        return student;
    }

    public void delete(Integer id) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stusite", "root", "1995");
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM student WHERE id=?");
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();

    }

    public void update(Student student) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stusite", "root", "1995");
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE student SET name = ? , family = ? , college = ? WHERE id = ?");
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getFamily());
        preparedStatement.setString(3, student.getCollege());
        preparedStatement.setInt(4, student.getId());
        preparedStatement.executeUpdate();


    }
}
