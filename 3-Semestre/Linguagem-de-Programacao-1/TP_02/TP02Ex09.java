// DUPLA: Laysa Bernardes e Lucas Lopes.
// EXERCICIO 9
/* Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.
*/
import java.util.Scanner;

public class TP02Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário as dimensões da matriz
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        // Verificando se as dimensões da matriz estão dentro dos limites
        if (linhas <= 0 || linhas > 10 || colunas <= 0 || colunas > 10) {
            System.out.println("As dimensões da matriz devem ser positivas e menores ou iguais a 10.");
            scanner.close(); // Fechar o Scanner antes de encerrar o programa
            return; // Encerrar o programa se as dimensões não forem válidas
        }

        // Definindo a matriz de acordo com as dimensões fornecidas pelo usuário
        int[][] matriz = new int[linhas][colunas];

        // Preenchendo a matriz com os valores fornecidos pelo usuário
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento da posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibindo a matriz original
        System.out.println("\nMatriz Original:");
        exibirMatriz(matriz);

        // Calculando e exibindo a matriz transposta
        System.out.println("\nMatriz Transposta:");
        int[][] transposta = calcularTransposta(matriz);
        exibirMatriz(transposta);

        scanner.close(); // Fechar o Scanner após a sua utilização
    }

    // Método para calcular a matriz transposta
    public static int[][] calcularTransposta(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }

    // Método para exibir a matriz
    public static void exibirMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
