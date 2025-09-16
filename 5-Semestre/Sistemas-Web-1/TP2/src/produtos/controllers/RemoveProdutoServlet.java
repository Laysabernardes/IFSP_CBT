package produtos.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import produtos.models.*;

/** @author Laysa Bernardes e Lucas Lopes */

@WebServlet("/removeProduto")
public class RemoveProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Banco _produtos = new Banco();
    

	@Override   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		
		_produtos.remove(id);
		
		response.sendRedirect("listaProdutos");
	}

}
