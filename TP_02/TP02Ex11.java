// DUPLA: Laysa Bernardes e Lucas Lopes.
// EXERCICIO 11
/*  Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz.
*/

import java.util.Scanner;

public class TP02Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a ordem da matriz (MxM)
        System.out.print("Digite a ordem da matriz (MxM, máximo de 10): ");
        int ordem = scanner.nextInt();

        // Verificar se a ordem é válida
        if (ordem <= 0 || ordem > 10) {
            System.out.println("A ordem da matriz deve ser um número positivo menor ou igual a 10.");
            scanner.close(); // Fechar o Scanner
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

        // Calcular e exibir o determinante da matriz
        double determinante = calcularDeterminante(matriz);
        System.out.println("\nDeterminante da matriz: " + determinante);

        scanner.close(); // Fechar o Scanner
    }

    // Método para calcular o determinante de uma matriz quadrada
    public static double calcularDeterminante(double[][] matriz) {
        int ordem = matriz.length;
        double determinante = 0;

        // Caso base: a matriz é 1x1
        if (ordem == 1) {
            determinante = matriz[0][0];
        }
        // Caso base: a matriz é 2x2
        else if (ordem == 2) {
            determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }
        // Caso geral: a matriz é de ordem maior que 2
        else {
            for (int j = 0; j < ordem; j++) {
                determinante += matriz[0][j] * cofator(matriz, 0, j);
            }
        }

        return determinante;
    }

    // Método para calcular o cofator de um elemento de uma matriz
    public static double cofator(double[][] matriz, int linha, int coluna) {
        int ordem = matriz.length;
        double[][] submatriz = new double[ordem - 1][ordem - 1];
        int p = 0, q = 0;

        // Criar a submatriz eliminando a linha e coluna do elemento
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if (i != linha && j != coluna) {
                    submatriz[p][q++] = matriz[i][j];
                    if (q == ordem - 1) {
                        q = 0;
                        p++;
                    }
                }
            }
        }

        // Calcular o cofator usando a fórmula: (-1)^(linha + coluna) * determinante da submatriz
        return Math.pow(-1, linha + coluna) * calcularDeterminante(submatriz);
    }
}
