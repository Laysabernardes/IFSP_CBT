// DUPLA: Laysa Bernardes e Lucas Lopes.
//EXERCICIO: 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
import java.util.Scanner;
// Importa a classe Scanner para entrada de dados

public class TP01Ex04 {
    
    public static void main(String args[]){
    
        Scanner scan = new Scanner(System.in);
        // Cria um objeto Scanner para receber entrada do usuário

        System.out.println("Insira o valor da base do Triangulo");
        // Solicita ao usuário que insira o valor da base do trinagulo

        double base = scan.nextDouble();
        // Lê o valor da base do triangulo fornecido pelo usuário.

        System.out.println("Insira o valor da area do Triangulo");
        // Solicita ao usuário que insira o valor da area do trinagulo

        double altura = scan.nextInt();
        // Lê o valor da base do triangulo fornecido pelo usuário.

        double area = (base*altura); 
        //Calcula a área do triangulo (base * altura)

        System.out.println("O valor da area : " +area);
        // Exibe a área calculada do Triangulo

        scan.close(); 
        // Fechar o Scanner após o uso 
    } 
}