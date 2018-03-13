package com.codecool.web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/subscribeServlet")
public class SubscribeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");

        System.out.println("Email: " + email);

        PrintWriter writer = response.getWriter();

        String htmlRespone = "<html>";
        htmlRespone += "<head><meta charset=\"UTF-8\"></head><br/>";
        htmlRespone += "<body>";
        htmlRespone += "<h2>Your email is: " + email + "<br/>";
        htmlRespone += "</body>";
        htmlRespone += "</html>";

        writer.println(htmlRespone);
    }
}
