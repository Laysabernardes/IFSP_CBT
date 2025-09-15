// DUPLA: Laysa Bernardes e Lucas Lopes. 
//EXERCICIO: 10 - Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.

import java.util.Scanner; 
// Importa a classe Scanner para entrada de dados
public class TP01Ex10 {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        // Cria um objeto Scanner para receber entrada do usuário

        System.out.println("Insira uma temperatura em graus Celsius");
        // Solicita ao usuário que insira uma temperatura em graus celsius

        double celsius = scan.nextDouble();
        //Lê o valor da temperatura inserida pelo usuario

        double conversao = celsius*1.8+32; 
        //Realiza o calculo de conversao de temperatura. 

        System.out.println("O valor em Fahrenheit é: " +conversao);
        //exibe o valor convertido para Fahrenheit

        scan.close(); 
        // Fechar o Scanner após o uso
    }
}