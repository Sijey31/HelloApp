package org.wcs.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/hello-form", "/custom-hello"})
public class SimpleHelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        int hour = Integer.parseInt(request.getParameter("hour"));

        String time = "";
        if (hour > 6 && hour <= 12) {
            time = "Good morning";
        }
        if (hour > 12 && hour <= 20) {
            time = "Good afternoon";
        }
        if (hour > 20) {
            time = "Good night";
        }
        if (hour <= 6) {
            time = "Good night";
        }

        String message = firstname + " " + lastname + " " + time;
        request.setAttribute("sample", message);
        this.getServletContext().getRequestDispatcher("/custom-hello.jsp")
                .forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
