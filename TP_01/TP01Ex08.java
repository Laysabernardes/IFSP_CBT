// DUPLA: Laysa Bernardes e Lucas Lopes. 
//EXERCICIO: 8 - Sabendo que uma milha marÃ­tima equivale a um mil, oitocentos e cinquenta e dois metros e que um quilÃ´metro possui mil metros, fazer um programa para converter milhas marÃ­timas em quilometros.
import java.util.Scanner;
// Importa a classe Scanner para entrada de dados

public class TP01Ex08 {

   public static void main(String args[]){
    
        Scanner scan = new Scanner(System.in);
        // Cria um objeto Scanner para receber entrada do usuário

        System.out.println("Insira o valor em milhas que serÃ¡ convertido para quilometros");
        // Solicita ao usuário que insira o valor que sera convertido

        double valor = scan.nextDouble();
        // Lê o valor inserido pelo usuario 

        double resultado = (valor*1.852);
        //Faz o calculo de conversão
        
        System.out.println("O valor da conversÃ£o : " +resultado);
        //Exibe o valor da conversão
        
        scan.close(); 
        // Fechar o Scanner após o uso
    }
}