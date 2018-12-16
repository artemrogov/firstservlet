package datatojsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "DataToJSP", urlPatterns = {"/countries"})
public class DataToJSP extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String[] countries = {"Russia","Germany", "USA","British","China","Slovakia"};

        String title = "Список стран";
        String description = "Контент для категории";

        String nameListCountries = "Список стран из массива: ";

        request.setAttribute("countriesData",countries);
        request.setAttribute("title",title);
        request.setAttribute("description",description);

        request.setAttribute("list",nameListCountries);

        request.setAttribute("is_page",this.getServletName());


        this.getServletContext().getRequestDispatcher("/countries.jsp").forward(request,response);
    }

}
