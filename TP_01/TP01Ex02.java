// DUPLA: Laysa Bernardes e Lucas Lopes. 
//EXERCICIO: 2 - Calcular e exibir a area de um quadrado, a partir do valor de sua aresta que sera digitado.
import java.util.Scanner; 
// Importa a classe Scanner para entrada de dados

public class TP01Ex02 {
    
    public static void main(String args[]){
    
        Scanner scan = new Scanner(System.in);
        // Cria um objeto Scanner para receber entrada do usuário

        System.out.println("Insira o valor da aresta do quadrado");
        // Solicita ao usuário que insira o valor da aresta do quadrado

        int aresta = scan.nextInt();
        // Lê o valor da aresta do quadrado fornecido pelo usuário

        int area = (aresta*aresta); 
        // Calcula a área do quadrado (lado * lado)

        System.out.println("O valor da area : " +area);
        // Exibe a área calculada do quadrado

        scan.close(); 
        // Fechar o Scanner após o uso
        
    } 
}