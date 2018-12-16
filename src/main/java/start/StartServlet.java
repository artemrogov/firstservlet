package start;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class StartServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String,String> menuItems = new HashMap<>();

        menuItems.put("/countries","список стран");
        menuItems.put("/servlet1","пробный сервлет");
        menuItems.put("/servlet3","Сервлет номер 3");

        request.setAttribute("menuItemsMaps",menuItems);

        this.getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);

        //response.getWriter().print("Start Servlet");
    }
}
