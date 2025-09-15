// DUPLA: Laysa Bernardes e Lucas Lopes.
// EXERCICIO 4
// Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
import java.util.Scanner;

public class TP02Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Inicializa o Scanner para entrada de dados

        int[][] array = new int[2][3]; // Declara uma matriz de ordem 2x3

        // Loop para preencher a matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                // Solicita ao usuário que digite o valor para a posição (i+1, j+1)
                System.out.print("Digite o valor na posição " + (i + 1) + ", " + (j + 1) + ": ");
                array[i][j] = scan.nextInt(); // Armazena o valor na matriz
            }
            System.out.println("\n"); // Adiciona uma linha em branco após cada linha de valores
        }

        // Loop para exibir os valores da matriz na tela
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "|"); // Exibe o valor e separa com "|"
            }
            System.out.print("\n"); // Adiciona uma quebra de linha após cada linha de valores
            System.out.print("------"); // Adiciona uma linha horizontal após cada linha de valores
            System.out.print("\n"); // Adiciona uma quebra de linha após a linha horizontal
        }

        scan.close(); // Fecha o Scanner após o uso
    }
}
