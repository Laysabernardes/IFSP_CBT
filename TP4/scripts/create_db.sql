-- =======================================================
-- Script para Criação do Banco - Projeto Servlet Cookies
-- Nomes da Dupla:
-- - Laysa Bernardes
-- - Lucas Lopes
-- =======================================================

CREATE DATABASE IF NOT EXISTS `cookies`;
USE `cookies`;

CREATE TABLE IF NOT EXISTS `preferences` (
  `user_id`       VARCHAR(255) NOT NULL,
  `currency_pair` VARCHAR(10)  NOT NULL,
  PRIMARY KEY (`user_id`)
);