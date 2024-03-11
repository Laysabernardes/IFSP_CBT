// 9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.

import java.util.Scanner;
public class TP01Ex09 {
    public static void main(String args[]){
        //Instância que captura o teclado. 
        Scanner scan= new Scanner(System.in); 
        //Capturando resistência
        System.out.println("Digite o valor da resistencia: ");
        double resistencia = scan.nextDouble();
        //Capturando corrente elétrica
        System.out.println("Digite o valor da corrente eletrica: ");
        double corrente = scan.nextDouble();
        //Exibindo resultado:
        double tensao = resistencia * corrente;
        System.out.println("A media geometrica: " + tensao);
    }
}