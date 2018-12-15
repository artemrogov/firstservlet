package servlet3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {

        PrintWriter writer = null;
        response.setContentType("text/html");

        try {
            writer = response.getWriter();
            writer.println("<html><head><title>Servlet 3</title><head><body>");
            writer.println("<h1>Servlet number 3</h1>");
            writer.println("<p>Content Servlet 3</p>");
            writer.println("</body></html>");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            if (writer!=null){
                writer.close();
            }
        }


    }
}
