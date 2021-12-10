package com.company.biz;

import com.company.data.StudentData;
import com.company.ui.models.Student;

import java.util.List;

public class StudentService {

    public void save(Student student) throws Exception {
        StudentData data = new StudentData();
        data.save(student);
    }

    public List<Student> getAll() throws Exception {
        StudentData data = new StudentData();
        return data.getAll();
    }
}
