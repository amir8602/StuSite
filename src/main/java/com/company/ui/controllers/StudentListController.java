package com.company.ui.controllers;

import com.company.biz.StudentService;
import com.company.ui.models.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list.do")
public class StudentListController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentService service = new StudentService();
        try {
            List <Student> students = service.getAll();
            req.setAttribute("allSts" , students);
            req.getRequestDispatcher("/WEB-INF/list.jsp").forward(req,resp);
        } catch (Exception e) {
            resp.sendRedirect("/error.jsp");

        }

    }
}
