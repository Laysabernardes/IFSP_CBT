// DUPLA: Laysa Bernardes e Lucas Lopes. 
//EXERCICIO: 12 - Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados.

import java.util.Scanner; 
// Importa a classe Scanner para entrada de dados

public class TP01Ex12 {
    public static void main(String args[]){
    
        Scanner scan = new Scanner(System.in);
        // Cria um objeto Scanner para receber entrada do usuário

        System.out.println("Insira o valor da altura do cone");
        // Solicita ao usuário que insira o valor da altura do cone

        double altura = scan.nextDouble();
        // Lê o valor da da altura do cone fornecido pelo usuário

        System.out.println("Insira o valor do raio da base do cone");
        // Solicita ao usuário que insira o valor do raio da base do cone

        double raio = scan.nextDouble();
        // Lê o valor do raio da base do cone fornecido pelo usuário

        double volume = (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;
        //Calculo do volume

        System.out.println("O volume do cone é : " +volume);
        // Exibe o volume do cone

        scan.close(); 
        // Fechar o Scanner após o uso
    }
}