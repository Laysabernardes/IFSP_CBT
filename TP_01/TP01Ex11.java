// DUPLA: Laysa Bernardes e Lucas Lopes. 
// 11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.

import java.util.Scanner;
public class TP01Ex11 {
    public static void main(String args[]){
        //Instância que captura o teclado. 
        Scanner scan= new Scanner(System.in); 
        //Capturando diametro
        System.out.println("Digite o valor do diametro do circulo: ");
        double diametro = scan.nextDouble();
        //Calculando valor do raio
        double raio = diametro / 2;
        //Exibindo resultado:
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A media geometrica: " + area);
    }
}