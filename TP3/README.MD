# TRABALHO PRÁTICO 03

**Aluna:** Laysa Bernardes Campos da Rocha - CB3024873

**Aluno:** Lucas Lopes Cruz - CB3025284

Obs: O vídeo demonstrando o funcionamento da aplicação esta listado abaixo.

# Bookstore - Gerenciamento de Livros 📚

Este é um projeto de uma aplicação web simples desenvolvida em Java para gerenciar uma coleção de livros. A aplicação permite realizar as operações básicas de um CRUD (Create, Read, Update, Delete).

## ✨ Funcionalidades

O sistema permite as seguintes operações de gerenciamento de livros:

* **Listar:** Visualizar todos os livros cadastrados no banco de dados.
* **Inserir:** Adicionar um novo livro à coleção.
* **Atualizar:** Editar as informações de um livro existente.
* **Excluir:** Remover um livro do banco de dados.

## 🔧 Banco de Dados

**Tabela:** `book`

```sql
CREATE DATABASE `Bookstore`;

USE Bookstore;

CREATE TABLE `book` (
  `book_id` INT(11) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(128) NOT NULL,
  `author` VARCHAR(45) NOT NULL,
  `price` FLOAT NOT NULL,
  PRIMARY KEY (`book_id`),
  UNIQUE KEY `book_id_UNIQUE` (`book_id`),
  UNIQUE KEY `title_UNIQUE` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
```

# ✨ Teste 
![Teste Funcionando](./funcionando.gif)
