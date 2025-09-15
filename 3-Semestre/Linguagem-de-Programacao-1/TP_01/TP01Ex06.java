// DUPLA: Laysa Bernardes e Lucas Lopes. 
//EXERCICIO: 6 - Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
import java.util.Scanner;
// Importa a classe Scanner para entrada de dados

public class TP01Ex06 {
    
    public static void main(String args[]){
    
        Scanner scan = new Scanner(System.in);
        // Cria um objeto Scanner para receber entrada do usuário

        System.out.println("Insira o 1º valor: ");
        // Solicita ao usuário que insira 1º valor 

        double valor1 = scan.nextDouble();
        // Lê o 1º valor fornecido pelo usuário

        System.out.println("Insira o 2º valor: ");
        // Solicita ao usuário que insira 2º valor

        double valor2 = scan.nextDouble();
        // Lê o 2º valor fornecido pelo usuário

        System.out.println("Insira o 3º valor: ");
        // Solicita ao usuário que insira 3º valor

        double valor3 = scan.nextDouble();
        // Lê o 3º valor fornecido pelo usuário

        System.out.println("Insira o 4º valor: ");
        // Solicita ao usuário que insira 4º valor

        double valor4 = scan.nextDouble();
        // Lê o 4º valor fornecido pelo usuário
        
        double media = (valor1+valor2+valor3+valor4)/4; 
        // Calcula media aritimetica dos quatro valores

        System.out.println("O valor da area : " +media);
        //exibe a media calculada
        
        scan.close(); 
        // Fechar o Scanner após o uso
    }   
}