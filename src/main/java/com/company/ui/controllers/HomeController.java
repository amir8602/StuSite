package com.company.ui.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/index.jsp")
public class HomeController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("req is here");
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req,resp);
        //resp.sendRedirect("/WEB-INF/index.jsp");
    }
}
