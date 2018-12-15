package servlet1;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.IOException;

public class Servlet1 extends  HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().print("Hello servlet 1");
    }
}

