import bean.RegisterBean;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/register/a")
public class RegisterServlet extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    //
    req.setCharacterEncoding("utf-8");

    //
    String name = req.getParameter("name");
    String age = req.getParameter("age");
    String[] langs = req.getParameterValues("lang");
    res.setContentType("text/html;charset=utf-8");

    // Bean
    RegisterBean rb = new RegisterBean();
    rb.setName(name);
    rb.setAge(age);
    rb.setLangs(langs);

    //
    req.setAttribute("rb", rb);

    //
    RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
    rd.forward(req, res);
  }
  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    doPost(req, res);
  }
}
