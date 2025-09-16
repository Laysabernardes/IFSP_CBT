import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Laysa
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);
        Emp e = EmpDao.getEmployeeById(id);

        out.println("<!DOCTYPE html>");
        out.println("<html lang='pt-br'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Editar Funcionário</title>");
        out.println("<style>");
        out.println("body { margin: 0; padding: 0; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;");
        out.println("background-color: #f0f4f8; display: flex; justify-content: center; align-items: center; height: 100vh; }");
        out.println(".card { background-color: white; padding: 40px 30px; border-radius: 16px;");
        out.println("box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1); text-align: center; max-width: 400px; width: 100%; }");
        out.println("h1 { margin-bottom: 25px; font-size: 28px; color: #2e7d32; }");
        out.println("form { text-align: left; }");
        out.println("table { width: 100%; }");
        out.println("td { padding: 10px 0; }");
        out.println("input[type='text'], input[type='password'], input[type='email'], select {");
        out.println("width: 100%; padding: 8px; border: 1px solid #ccc; border-radius: 6px; }");
        out.println("input[type='submit'] { background-color: #4CAF50; color: white; padding: 12px 20px;");
        out.println("border: none; border-radius: 8px; font-size: 16px; cursor: pointer; width: 100%; }");
        out.println("input[type='submit']:hover { background-color: #388e3c; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='card'>");
        out.println("<h1>Editar Funcionário</h1>");
        out.println("<form action='EditServlet2' method='post'>");
        out.println("<input type='hidden' name='id' value='" + e.getId() + "'/>");
        out.println("<table>");
        out.println("<tr><td>Nome:</td><td><input type='text' name='name' value='" + e.getName() + "'/></td></tr>");
        out.println("<tr><td>Senha:</td><td><input type='password' name='password' value='" + e.getPassword() + "'/></td></tr>");
        out.println("<tr><td>Email:</td><td><input type='email' name='email' value='" + e.getEmail() + "'/></td></tr>");
        out.println("<tr><td>País:</td><td>");
        out.println("<select name='country'>");
        out.println("<option" + (e.getCountry().equals("India") ? " selected" : "") + ">India</option>");
        out.println("<option" + (e.getCountry().equals("USA") ? " selected" : "") + ">USA</option>");
        out.println("<option" + (e.getCountry().equals("UK") ? " selected" : "") + ">UK</option>");
        out.println("<option" + (e.getCountry().equals("Other") ? " selected" : "") + ">Other</option>");
        out.println("</select>");
        out.println("</td></tr>");
        out.println("<tr><td colspan='2'><input type='submit' value='Editar e Salvar'/></td></tr>");
        out.println("</table>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
