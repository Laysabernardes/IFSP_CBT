// 17. Entrar via teclado com dois valores quaisquer X e Y. Calcular e exibir o cálculo XY (X elevado a Y). Pesquisar as funções Exp e Ln.

import java.util.Scanner;
public class TP01Ex17 {
    public static void main(String[] args) {
        //Instância que captura o teclado. 
        Scanner scan = new Scanner(System.in);

        //Capturando X e Y
        System.out.print("Digite o valor de X: ");
        double x = scan.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double y = scan.nextDouble();

        //Exibindo o resultado
        double resultado = Math.exp(y * Math.log(x));
        System.out.println("O resultado de " + x + " elevado a " + y + " e: " + resultado);
    }
}

