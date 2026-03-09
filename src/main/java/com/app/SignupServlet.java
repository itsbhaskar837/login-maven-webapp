package com.app;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SignupServlet extends HttpServlet {

protected void doPost(HttpServletRequest request,
HttpServletResponse response) throws ServletException, IOException {

String user = request.getParameter("username");

response.setContentType("text/html");

PrintWriter out = response.getWriter();

out.println("<h2>User Registered: " + user + "</h2>");

}

}
