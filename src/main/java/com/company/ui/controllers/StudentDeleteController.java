package com.company.ui.controllers;

import com.company.biz.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete.do")
public class StudentDeleteController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        StudentService service = new StudentService();
        try {
            service.delete(id);
            resp.sendRedirect("/list.do");
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect("/error.do");
        }
    }
}
