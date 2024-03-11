// 13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso (em s) que serão digitados.

import java.util.Scanner;
public class TP01Ex13 {
    public static void main(String args[]){
        //Instância que captura o teclado. 
        Scanner scan= new Scanner(System.in); 
        //Capturando velocidade inicial
        System.out.print("Digite a velocidade inicial (em m/s): ");
        double velInicial = scan.nextDouble();
        //Capturando aceleração
        System.out.print("Digite a aceleracao (em m/s^2): ");
        double aceleracao = scan.nextDouble();
        //Capturando tempo de percurso
        System.out.print("Digite o tempo de percurso (em s): ");
        double tempo = scan.nextDouble();
       //Exibindo resultado:
        double velFinal = (velInicial + (aceleracao * tempo)) * 3.6;
        System.out.println("A velocidade final do automovel: " + velFinal + " km/h");
    }
}