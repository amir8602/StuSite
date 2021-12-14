package com.company.ui.controllers;

import com.company.biz.StudentService;
import com.company.ui.models.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit.do")
public class StudentEditController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        StudentService service = new StudentService();
        try {
            Student student = service.getStudent(id);
            req.setAttribute("sts", student);
            req.getRequestDispatcher("/WEB-INF/edit.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
