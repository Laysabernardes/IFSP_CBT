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

@WebServlet("/novoProduto")
public class NovoProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Banco _produtos = new Banco();
    

	@Override   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/formNovoProduto.jsp");
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produto novoProduto = new Produto();
		
		
		novoProduto.setNome(request.getParameter("nome"));
		novoProduto.setDescricao(request.getParameter("descricao"));
		novoProduto.setUnidadeCompra(Integer.parseInt(request.getParameter("unidadeCompra")));
		novoProduto.setQtdPrevistoMes(Double.parseDouble(request.getParameter("qtdPrevistoMes")));
		novoProduto.setPrecoMaxComprado(Double.parseDouble(request.getParameter("precoMaxComprado")));
		
		
		
		_produtos.add(novoProduto);
		
		response.sendRedirect("listaProdutos");
		
	}

}
