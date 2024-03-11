// DUPLA: Laysa Bernardes e Lucas Lopes. 
//1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.

import java.util.Scanner;
public class TP01Ex01 {
    public static void main(String args[]){
        //Instância que captura o teclado. 
        Scanner scan= new Scanner(System.in); 
        //Capturando num1:
        System.out.println("Digite a altura do seu retangulo: ");
        int high= scan.nextInt();
        //Capturando num2:
        System.out.println("Digite a base do retangulo:");
        int base= scan.nextInt();
        //Exibindo a área do retangulo:
        int area= (high * base);
        System.out.println("A base do retangulo: " + area);
    }
}