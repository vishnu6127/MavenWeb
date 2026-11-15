```java
package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().println(
            "<!DOCTYPE html>" +
            "<html>" +
            "<head>" +
            "<title>Hello Servlet</title>" +
            "<style>" +
            "body { font-family: Arial; text-align: center; margin-top: 100px; }" +
            "h1 { color: green; }" +
            "p { color: #555; font-size: 18px; }" +
            "</style>" +
            "</head>" +
            "<body>" +
            "<h1>Hello from Maven Web Application!</h1>" +
            "<p>My Week 11 Jenkins CI/CD Lab Project</p>" +
            "<p>Servlet is running successfully!</p>" +
            "</body>" +
            "</html>"
        );
    }
}
```
