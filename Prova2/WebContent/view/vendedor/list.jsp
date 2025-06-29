<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Inventário - Lista de Vendedores</title>
    <style>
        /* CSS COMPLETO E EMBUTIDO DIRETAMENTE AQUI */
        * { box-sizing: border-box; }
       body, html { margin: 0; padding: 0; height: 100%; font-family: 'Segoe UI', sans-serif; background-color: #f0f4f8; display: flex; flex-direction: column; }
        header { background-color: white; box-shadow: 0 2px 8px rgba(0,0,0,0.1); padding: 15px 30px; height: 70px; display: flex; align-items: center; justify-content: space-between; z-index: 100; }
        header .menu-left a { text-decoration: none; font-size: 24px; color: #2e7d32; font-weight: bold; }
        header .menu-right ul { list-style: none; margin: 0; padding: 0; display: flex; }
        header .menu-right li a { text-decoration: none; color: #4CAF50; font-weight: 600; margin-left: 20px; padding: 10px; border-radius: 5px; transition: background-color 0.3s ease; }
        header .menu-right li a:hover { background-color: #e8f5e9; }
        main.container { max-width: 900px; margin:auto; padding: 40px; background-color: #ffffff; border-radius: 16px; box-shadow: 0 10px 25px rgba(0,0,0,0.1); }
        .wrapper { display: flex; justify-content: space-between; align-items: center; margin-bottom: 30px; padding-bottom: 20px; border-bottom: 1px solid #eee; }
        .wrapper h1 { font-size: 28px; color: #2e7d32; margin: 0; }
        table { width: 100%; border-collapse: collapse; font-size: 1rem; }
        th, td { padding: 15px; text-align: left; border-bottom: 1px solid #dee2e6; }
        thead th { background-color: #4CAF50; color: white; font-weight: 600; text-transform: uppercase; font-size: 0.9rem; }
        tbody tr:nth-child(even) { background-color: #f8f9fa; }
        tbody tr:hover { background-color: #e9ecef; }
        td a { color: #007bff; font-weight: 600; text-decoration: none; padding: 5px 8px; border-radius: 4px; }
        td a:hover { background-color: #e7f3ff; text-decoration: none; }
        .button { padding: 10px 20px; border: none; border-radius: 8px; font-size: 1rem; font-weight: 600; cursor: pointer; text-decoration: none; text-align: center; transition: all 0.2s ease; background-color: #4CAF50; color: white; }
        .button:hover { background-color: #388e3c; }
        footer { background-color: white; box-shadow: 0 -2px 8px rgba(0,0,0,0.1); height: 50px; display: flex; justify-content: center; align-items: center; color: #4CAF50; font-weight: 600; }
        .alert { padding: 15px; margin-bottom: 20px; border: 1px solid transparent; border-radius: 8px; font-size: 1rem; font-weight: 600; }
        .alert-success { color: #155724; background-color: #d4edda; border-color: #c3e6cb; }
        .alert-danger { color: #721c24; background-color: #f8d7da; border-color: #f5c6cb; }
   
     </style>
</head>
<body>
    <header>
        <div class="menu-left"><a href="${pageContext.request.contextPath}/home">Prova 2</a></div>
        <div class="menu-right">
            <ul>
                <li><a href="${pageContext.request.contextPath}/clientes">Clientes</a></li>
                <li><a href="${pageContext.request.contextPath}/vendedores">Vendedores</a></li>
                <li><a href="${pageContext.request.contextPath}/ordensVenda">Ordens de Venda</a></li>
            </ul>
        </div>
    </header>
    
    <main class="container">
    
        <c:if test="${param.msg == 'deleteSuccess'}">
            <div class="alert alert-success">Vendedor removido com sucesso!</div>
        </c:if>
        <c:if test="${param.msg == 'deleteError'}">
            <div class="alert alert-danger"><strong>Erro!</strong> Este vendedor não pode ser removido, pois está associado a clientes ou ordens de venda.</div>
        </c:if>
        
        <div class="wrapper">
            <h1>Vendedores</h1>
            <a href="${pageContext.request.contextPath}/vendedores/new" class="button">Novo Vendedor</a>
        </div>
        
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome do Vendedor</th>
                    <th>Cidade</th>
                    <th>Comissão</th>
                    <th colspan="2">Ações</th>
                </tr>
            </thead>
            <tbody>
                <c:if test="${empty list}">
                    <tr>
                        <td colspan="6" style="text-align: center; padding: 30px;">Sem vendedores cadastrados.</td>
                    </tr>
                </c:if>
                
                <c:forEach var="item" items="${list}">
                    <tr>
                        <td><c:out value="${item.salesmanId}" /></td>
                        <td><c:out value="${item.name}" /></td>
                        <td><c:out value="${item.city}" /></td>
                        <td><c:out value="${item.commission}" /></td>
                        <td>
                            <a href="${pageContext.request.contextPath}/vendedores/edit?id=<c:out value='${item.salesmanId}' />">Editar</a>
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/vendedores/delete?id=<c:out value='${item.salesmanId}' />" 
                               onclick="return confirm('Tem certeza que deseja remover este vendedor?');">Remover</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </main>
    <footer>
        Desenvolvido por Laysa Bernardes e Lucas Lopes
    </footer>
</body>
</html>