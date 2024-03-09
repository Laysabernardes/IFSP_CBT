// DUPLA: Laysa Bernardes e Lucas Lopes. 
//EXERCICIO: 14 - Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio r inscrita em um cubo perfeito de aresta a. Os valores de r  e a serão digitados.

import java.util.Scanner; 
// Importa a classe Scanner para entrada de dados
public class TP01Ex14 {
    public static void main(String args[]) {
        // Cria um objeto Scanner para receber entrada do usuário
        Scanner scan = new Scanner(System.in);
        
        // Solicita ao usuário que insira o valor do raio da esfera
        System.out.println("Insira o valor do raio da esfera (r):");
        
        // Lê o valor do raio da esfera fornecido pelo usuário
        double raio = scan.nextDouble();
        
        // Solicita ao usuário que insira o valor da aresta do cubo
        System.out.println("Insira o valor da aresta do cubo (a):");
        
        // Lê o valor da aresta do cubo fornecido pelo usuário
        double aresta = scan.nextDouble();
        
        // Calcula o volume do cubo (a^3)
        double volumeCubo = Math.pow(aresta, 3);
        
        // Calcula o volume da esfera ((4/3) * π * raio^3)
        double volumeEsfera = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
        
        // Calcula o volume livre subtraindo o volume da esfera do volume do cubo
        double volumeLivre = volumeCubo - volumeEsfera;
        
        // Exibe o volume livre calculado do ambiente
        System.out.println("O volume livre do ambiente é: " + volumeLivre);
        
        // Fecha o Scanner para liberar recursos
        scan.close();
    }
}