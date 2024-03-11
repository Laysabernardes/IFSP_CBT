// 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).

import java.util.Scanner;
public class TP01Ex15 {
    public static void main(String[] args) {
        //Instância que captura o teclado. 
        Scanner scan = new Scanner(System.in);
        // Capturando cotação e quantidade de doláres
        System.out.print("Digite a cotacao do dolar: ");
        double cotacaoDolar = scan.nextDouble();
        System.out.print("Digite a quantidade de dolares: ");
        double qtDolares = scan.nextDouble();
        //Exibindo resultado:
        double valorReais = qtDolares * cotacaoDolar;
        System.out.println("O valor correspondente em Reais é: R$" + valorReais);
    }
}
