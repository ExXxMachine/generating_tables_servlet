import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String height = request.getParameter("h");
        String width = request.getParameter("w");
        String color = request.getParameter("color");

        String table = "";
        for (int i = 0; i < Integer.parseInt(height);i++){
            table += "<tr>";
            for (int j = 0; j < Integer.parseInt(width);j++){
                table += "<td>Text</td>";
            }
            table += "</tr>";
        }
        pw.println("<html>");
        pw.println("<table border='2' style='width: 20%;' bgcolor='"+ color +"'>" + table + "</table>");
        pw.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
