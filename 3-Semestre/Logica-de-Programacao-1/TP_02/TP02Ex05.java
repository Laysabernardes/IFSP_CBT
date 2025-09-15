// DUPLA: Laysa Bernardes e Lucas Lopes.
// EXERCICIO 5
// Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.

import java.util.Scanner;

public class TP02Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] array = new int[3][2]; // Declara uma matriz de ordem 3x2 para armazenar valores

        // Loop para preencher a matriz com valores fornecidos pelo usuário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                // Solicita ao usuário que digite o valor para a posição (i+1, j+1)
                System.out.print("Digite o valor na posição " + (i + 1) + ", " + (j + 1) + ": ");
                array[i][j] = scan.nextInt(); // Armazena o valor na matriz
            }
            System.out.println("\n"); // Adiciona uma linha em branco após cada linha de valores
        }

        // Loop para exibir os valores da matriz na tela
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j]); // Exibe o valor
                System.out.print("|"); // Separador
            }
            System.out.print("\n");
            System.out.print("----");
            System.out.print("\n");
        }

        scan.close(); // Fecha o Scanner após o uso
    }
}
