package org.gerdoc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;

@WebServlet("/MiServlet")
public class MiServlet extends HttpServlet
{
    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hola desde Servlet</h1>");
        out.println("<table border =1>");
        out.println("<tr>");
        out.println("<th> ID </th>");
        out.println("<th> Nombre </th>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>1</td>");
        out.println("<td>Gerdoc</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>2</td>");
        out.println("<td>Ruth</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("<p>Tomcat 9 + IntelliJ + Maven</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
