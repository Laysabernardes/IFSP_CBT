import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Laysa e Lucas

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html><head><meta charset='UTF-8'><title>Funcionários</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 40px; }");
        out.println("h1 { text-align: center; color: #333; }");
        out.println("table { width: 100%; border-collapse: collapse; background-color: #fff; box-shadow: 0 4px 8px rgba(0,0,0,0.1); }");
        out.println("th, td { padding: 12px; text-align: left; border-bottom: 1px solid #ddd; }");
        out.println("th { background-color: #4CAF50; color: white; }");
        out.println("tr:hover { background-color: #f1f1f1; }");
        out.println("a { color: #4CAF50; text-decoration: none; }");
        out.println("a:hover { text-decoration: underline; }");
        out.println(".top-link { display: block; margin-bottom: 20px; text-align: center; font-weight: bold; }");
        out.println("</style></head><body>");

        out.println("<a class='top-link' href='index.html'>+ Adicionar Novo Funcionário</a>");
        out.println("<h1>Lista de Funcionários</h1>");

        List<Emp> list = EmpDao.getAllEmployees();

        out.print("<table>");
        out.print("<tr><th>ID</th><th>Nome</th><th>Senha</th><th>Email</th><th>País</th><th>Editar</th><th>Excluir</th></tr>");
        for (Emp e : list) {
            out.print("<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td>" + e.getPassword() + "</td>"
                    + "<td>" + e.getEmail() + "</td><td>" + e.getCountry() + "</td>"
                    + "<td><a href='EditServlet?id=" + e.getId() + "'>Editar</a></td>"
                    + "<td><a href='DeleteServlet?id=" + e.getId() + "' onclick=\"return confirm('Deseja realmente excluir?')\">Excluir</a></td></tr>");
        }
        out.print("</table>");

        out.println("</body></html>");
        out.close();
    }
}
