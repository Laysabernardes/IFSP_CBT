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

@WebServlet("/alteraProduto")
public class AlteraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Banco _produtos = new Banco();
    

	@Override   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		Produto produto = _produtos.getById(id);
		
		
		request.setAttribute("produto", produto);
		
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraProduto.jsp");
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produto novoProduto = new Produto();
		
		
		novoProduto.setId(Integer.parseInt(request.getParameter("id")));
		novoProduto.setNome(request.getParameter("nome"));
		novoProduto.setDescricao(request.getParameter("descricao"));
		novoProduto.setUnidadeCompra(Integer.parseInt(request.getParameter("unidadeCompra")));
		novoProduto.setQtdPrevistoMes(Double.parseDouble(request.getParameter("qtdPrevistoMes")));
		novoProduto.setPrecoMaxComprado(Double.parseDouble(request.getParameter("precoMaxComprado")));
		
		System.out.print(novoProduto.getNome());
		
		_produtos.update(novoProduto);
		
		response.sendRedirect("listaProdutos");
		
	}

}
