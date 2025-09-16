import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Laysa e Lucas

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        Emp e = new Emp();
        e.setName(name);
        e.setPassword(password);
        e.setEmail(email);
        e.setCountry(country);

        int status = EmpDao.save(e);

        out.println("<!DOCTYPE html>");
        out.println("<html><head><meta charset='UTF-8'><title>Salvar Funcionário</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 40px; }");
        out.println(".card { max-width: 400px; margin: 0 auto; background: white; padding: 30px; border-radius: 10px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); }");
        out.println("h1 { text-align: center; }");
        out.println(".success-message { background-color: #dff0d8; color: #3c763d; padding: 15px; border-radius: 5px; margin-bottom: 20px; text-align: center; font-weight: bold; }");
        out.println("a { display: block; text-align: center; color: #4CAF50; text-decoration: none; font-weight: bold; margin-top: 15px; }");
        out.println("a:hover { text-decoration: underline; }");
        out.println("</style></head><body>");

        out.println("<div class='card'>");

        if (status > 0) {
            out.println("<div class='success-message'>Funcionário salvo com sucesso!</div>");
        } else {
            out.println("<div class='success-message' style='background-color:#f2dede; color:#a94442;'>Erro ao salvar funcionário!</div>");
        }

        out.println("<h1>Adicionar Novo Funcionário</h1>");
        out.println("<a href='index.html'>Voltar para o formulário</a>");
        out.println("<a href='ViewServlet'>Visualizar Funcionários</a>");
        out.println("</div></body></html>");

        out.close();
    }
}
