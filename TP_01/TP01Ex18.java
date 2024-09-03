// DUPLA: Laysa Bernardes e Lucas Lopes. 
//EXERCICIO: 2 - Calcular e exibir a area de um quadrado, a partir do valor de sua aresta que sera digitado.
import java.util.Scanner; 
// Importa a classe Scanner para entrada de dados

public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Solicita ao usuário que insira o valor de cada produto
        System.out.println("Insira o valor do primeiro produto:");
        double produto1 = scan.nextDouble();
        
        System.out.println("Insira o valor do segundo produto:");
        double produto2 = scan.nextDouble();
        
        System.out.println("Insira o valor do terceiro produto:");
        double produto3 = scan.nextDouble();
        
        System.out.println("Insira o valor do quarto produto:");
        double produto4 = scan.nextDouble();
        
        System.out.println("Insira o valor do quinto produto:");
        double produto5 = scan.nextDouble();
        
        // Calcula o total da compra somando os valores dos produtos
        double totalCompra = produto1 + produto2 + produto3 + produto4 + produto5;
        
        // Solicita ao usuário que insira o valor do pagamento
        System.out.println("Insira o valor do pagamento:");
        double pagamento = scan.nextDouble();
        
        // Calcula o troco que deve ser devolvido
        double troco = pagamento - totalCompra;
        
        // Exibe o troco calculado
        System.out.println("O troco a ser devolvido é: " + troco);
        
        scan.close();
        // Fechar o Scanner após o uso
    }
}