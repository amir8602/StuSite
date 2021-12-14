package com.company.ui.controllers;

import com.company.biz.StudentService;
import com.company.ui.models.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit-student.do")
public class StudentSubmitEditController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String family = req.getParameter("family");
        String college = req.getParameter("college");
        Student student = new Student(id , name , family , college);
        StudentService service = new StudentService();
        try {
            service.update(student);
            resp.sendRedirect("/list.do");
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect("/error.jsp");
        }
    }
}
