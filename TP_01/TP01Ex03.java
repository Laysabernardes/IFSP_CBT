// DUPLA: Laysa Bernardes e Lucas Lopes. 
//3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.

import java.util.Scanner;
public class TP01Ex03 {
    public static void main(String args[]){
        //Instância que captura o teclado. 
        Scanner scan= new Scanner(System.in); 
        //Capturando valor da diagonal:
        System.out.println("Digite o valor da diagonal do quadrado: ");
        int diagonal= scan.nextInt();
        //Exibindo valor da área:
        int quadrado= (diagonal * diagonal) / 2;
        System.out.println("O valor da area do quadrado e: " + quadrado);
    }
}