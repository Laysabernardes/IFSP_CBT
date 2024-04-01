// DUPLA: Laysa Bernardes e Lucas Lopes.
// EXERCICIO 10
/*  Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).
*/

import java.util.Scanner;
public class TP02Ex10 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a ordem da matriz (MxM)
        System.out.print("Digite a ordem da matriz (MxM, máximo de 10): ");
        int ordem = scanner.nextInt();

        // Verificar se a ordem é válida
        if (ordem <= 0 || ordem > 10) {
            System.out.println("A ordem da matriz deve ser um número positivo menor ou igual a 10.");
            scanner.close(); 
            return; // Encerrar o programa se a ordem não for válida
        }

        // Declarar e preencher a matriz com valores fornecidos pelo usuário
        double[][] matriz = new double[ordem][ordem];
        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Digite o elemento da posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Calcular e exibir a matriz inversa
        double[][] matrizInversa = calcularMatrizInversa(matriz);
        System.out.println("\nMatriz Inversa:");
        exibirMatriz(matrizInversa);

        scanner.close(); // Fechar o Scanner
    }

    // Método para calcular a matriz inversa
    public static double[][] calcularMatrizInversa(double[][] matriz) {
        // Calcular a matriz identidade do mesmo tamanho que a matriz original
        int ordem = matriz.length;
        double[][] identidade = new double[ordem][ordem];
        for (int i = 0; i < ordem; i++) {
            identidade[i][i] = 1;
        }

        // Aplicar o método de eliminação de Gauss-Jordan para calcular a inversa
        for (int i = 0; i < ordem; i++) {
            // Dividir a linha i da matriz original e da matriz identidade pelo pivô
            double pivô = matriz[i][i];
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] /= pivô;
                identidade[i][j] /= pivô;
            }

            // Subtrair múltiplos da linha i da matriz original e da matriz identidade das linhas abaixo
            for (int k = 0; k < ordem; k++) {
                if (k != i) {
                    double fator = matriz[k][i];
                    for (int j = 0; j < ordem; j++) {
                        matriz[k][j] -= fator * matriz[i][j];
                        identidade[k][j] -= fator * identidade[i][j];
                    }
                }
            }
        }

        return identidade; // A matriz identidade se torna a matriz inversa
    }

    // Método para exibir uma matriz
    public static void exibirMatriz(double[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
