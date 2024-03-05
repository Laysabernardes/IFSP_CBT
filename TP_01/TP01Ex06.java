import java.util.Scanner;
public class TP01Ex06 {
    
    public static void main(String args[]){
    //6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o 1º valor; ");
        double valor1 = scan.nextDouble();
        System.out.println("Insira o 2º valor; ");
        double valor2 = scan.nextDouble();
        System.out.println("Insira o 3º valor; ");
        double valor3 = scan.nextDouble();
        System.out.println("Insira o 4º valor; ");
        double valor4 = scan.nextDouble();
        
        double media = (valor1+valor2+valor3+valor4)/4; 
        System.out.println("O valor da area : " +media);
        
    }
    
}