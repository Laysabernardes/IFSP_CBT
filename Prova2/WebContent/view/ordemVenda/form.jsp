<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Inventário - Ordem de Venda</title>
    <style>
        * { box-sizing: border-box; }
        body, html { margin: 0; padding: 0; height: 100%; font-family: 'Segoe UI', sans-serif; background-color: #f0f4f8; display: flex; flex-direction: column; }
        header { background-color: white; box-shadow: 0 2px 8px rgba(0,0,0,0.1); padding: 15px 30px; height: 70px; display: flex; align-items: center; justify-content: space-between; z-index: 100; }
        header .menu-left a { text-decoration: none; font-size: 24px; color: #2e7d32; font-weight: bold; }
        header .menu-right ul { list-style: none; margin: 0; padding: 0; display: flex; }
        header .menu-right li a { text-decoration: none; color: #4CAF50; font-weight: 600; margin-left: 20px; padding: 10px; border-radius: 5px; transition: background-color 0.3s ease; }
        header .menu-right li a:hover { background-color: #e8f5e9; }
        main.container { max-width: 800px; margin:auto; padding: 40px; background-color: #ffffff; border-radius: 16px; box-shadow: 0 10px 25px rgba(0,0,0,0.1); }
        main.container h1 { font-size: 28px; color: #2e7d32; margin-top: 0; margin-bottom: 30px; text-align: center; }
        .form-group { margin-bottom: 20px; }
        .form-group label { display: block; margin-bottom: 8px; font-weight: 600; color: #495057; }
        .form-group input[type="text"], .form-group input[type="date"], .form-group input[type="number"], .form-group select { width: 100%; padding: 12px; border: 1px solid #ced4da; border-radius: 8px; font-size: 1rem; box-sizing: border-box; transition: border-color 0.2s ease, box-shadow 0.2s ease; }
        .form-group input:focus, .form-group select:focus { border-color: #4CAF50; outline: 0; box-shadow: 0 0 0 0.2rem rgba(76, 175, 80, 0.25); }
        .form-group-buttons { display: flex; justify-content: flex-end; gap: 15px; margin-top: 30px; border-top: 1px solid #eee; padding-top: 20px; }
        .button, input[type="submit"] { padding: 12px 24px; border: none; border-radius: 8px; font-size: 1rem; font-weight: 600; cursor: pointer; text-decoration: none; text-align: center; transition: all 0.2s ease; }
        input[type="submit"].button { background-color: #4CAF50; color: white; }
        input[type="submit"].button:hover { background-color: #388e3c; }
        .btn-cinza { background-color: #6c757d; color: white; }
        .btn-cinza:hover { background-color: #5a6268; }
         footer { background-color: white; box-shadow: 0 -2px 8px rgba(0,0,0,0.1); height: 50px; display: flex; justify-content: center; align-items: center; color: #4CAF50; font-weight: 600; }
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
        <h1>
            <c:if test="${ordemVenda != null}">Editar Ordem de Venda</c:if>
            <c:if test="${ordemVenda == null}">Nova Ordem de Venda</c:if>
        </h1>
        
        <div class="form-container">
            <form action="${ordemVenda != null ? 'update' : 'insert'}" method="post">
                <input type="hidden" name="ord_no" value="<c:out value='${ordemVenda.ordNo}' />" />
                
                <div class="form-group">
                    <label for="purch_amt">Valor da Compra:</label>
                    <input type="number" step="0.01" id="purch_amt" name="purch_amt" value="<c:out value='${ordemVenda.purchAmt}' />" required />
                </div>
                
                <div class="form-group">
                    <label for="ord_date">Data da Ordem:</label>
                    <fmt:formatDate value="${ordemVenda.ordDate}" pattern="yyyy-MM-dd" var="formattedDate" />
                    <input type="date" id="ord_date" name="ord_date" value="${formattedDate}" required />
                </div>
                
                <div class="form-group">
                    <label for="customer_id">Cliente:</label>
                    <select name="customer_id" id="customer_id" required>
                        <option value="">-- Selecione um cliente --</option>
                        <c:forEach var="cliente" items="${listaClientes}">
                            <option value="${cliente.customerId}" 
                                <c:if test="${ordemVenda.customerId == cliente.customerId}">selected</c:if>>
                                ${cliente.custName}
                            </option>
                        </c:forEach>
                    </select>
                </div>
                
                <div class="form-group">
                    <label for="salesman_id">Vendedor:</label>
                    <select name="salesman_id" id="salesman_id" required>
                        <option value="">-- Selecione um vendedor --</option>
                        <c:forEach var="vendedor" items="${listaVendedores}">
                            <option value="${vendedor.salesmanId}" 
                                <c:if test="${ordemVenda.salesmanId == vendedor.salesmanId}">selected</c:if>>
                                ${vendedor.name}
                            </option>
                        </c:forEach>
                    </select>
                </div>
                
                <div class="form-group-buttons">
                    <a href="${pageContext.request.contextPath}/ordensVenda" class="button btn-cinza">Cancelar</a>
                    <input type="submit" value="Salvar" class="button" />
                </div>
            </form>
        </div>
    </main>
    <footer>
        Desenvolvido por Laysa Bernardes e Lucas Lopes
    </footer>
</body>
</html>