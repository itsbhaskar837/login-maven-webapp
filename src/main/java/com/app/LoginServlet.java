package com.app;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {

protected void doPost(HttpServletRequest request,
HttpServletResponse response) throws ServletException, IOException {

String user = request.getParameter("username");
String pass = request.getParameter("password");

response.setContentType("text/html");

PrintWriter out = response.getWriter();

if(user.equals("admin") && pass.equals("admin"))
{
out.println("<h2>Login Successful</h2>");
}
else
{
out.println("<h2>Login Failed</h2>");
}

}

}
