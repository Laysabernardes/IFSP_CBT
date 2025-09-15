// DUPLA: Laysa Bernardes e Lucas Lopes.
// EXERCICIO 8
/*  Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
    digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
    valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
    correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
    colunas.
*/

import java.util.Scanner;

public class TP02Ex08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo e preenchendo a matriz original de ordem 3x4 com valores fornecidos pelo usuário
        int[][] matrizOriginal = new int[3][4];
        System.out.println("Digite os valores para a matriz original:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = scanner.nextInt();
            }
        }

        // Solicitando a constante multiplicativa ao usuário
        System.out.print("Digite a constante multiplicativa: ");
        int constante = scanner.nextInt();

        // Definindo e preenchendo a matriz resultado com o produto dos valores da matriz original pela constante
        int[][] matrizResultado = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrizResultado[i][j] = matrizOriginal[i][j] * constante;
            }
        }

        // Exibindo a matriz original
        System.out.println("\nMatriz Original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizOriginal[i][j] + " | ");
            }
            System.out.println();
        }

        // Exibindo a matriz resultado
        System.out.println("\nMatriz Resultado:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizResultado[i][j] + " | ");
            }
            System.out.println();
        }

        scanner.close(); // Fechar o Scanner
    }
}