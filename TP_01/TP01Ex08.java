import java.util.Scanner;

public class TP01Ex08 {

   public static void main(String args[]){
    //8. Sabendo que uma milha marÃ­tima equivale a um mil, oitocentos e cinquenta e dois metros e que um quilÃ´metro possui mil metros, fazer um programa para converter milhas marÃ­timas em quilÃ´metros.
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor em milhas que serÃ¡ convertido para qulometros");
        double valor = scan.nextDouble();
        double resultado = (valor*1.852);
        
        System.out.println("O valor da conversÃ£o : " +resultado);
        
    }
    
}