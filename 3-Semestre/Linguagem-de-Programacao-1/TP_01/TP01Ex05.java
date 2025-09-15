// DUPLA: Laysa Bernardes e Lucas Lopes. 
//5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.

import java.util.Scanner;
public class TP01Ex05 {
    public static void main(String args[]){
        //Instância que captura o teclado. 
        Scanner scan= new Scanner(System.in); 
        //Capturando valor da diagonal
        System.out.println("Digite o valor do diametro da sua esfera: ");
        double diametro = scan.nextDouble();
        //Exibindo resultado:
        double volumeEsfera = (4.0 / 3.0) * 3.1415 * Math.pow(diametro / 2.0, 3);
        System.out.println("O volume da esfera e: " + volumeEsfera);
    }
}