// 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.

import java.util.Scanner;
public class TP01Ex07 {
    public static void main(String args[]){
        //Instância que captura o teclado. 
        Scanner scan= new Scanner(System.in); 
        //Capturando valor 1
        System.out.println("Digite o primeiro valor: ");
        double valor1 = scan.nextDouble();
        //Capturando valor 2
        System.out.println("Digite o primeiro valor: ");
        double valor2 = scan.nextDouble();
        //Exibindo resultado:
        double mediaGeometrica = Math.sqrt(valor1 * valor2);
        System.out.println("A media geometrica: " + mediaGeometrica);
    }
}