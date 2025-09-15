// DUPLA: Laysa Bernardes e Lucas Lopes.
// EXERCICIO 7
/* Entrar via teclado com doze valores e armazena-los em uma matriz de ordem 3x4. Apos a
digitaaoo dos valores solicitar uma constante multiplicativa, que devera multiplicar cada
valor matriz e armazenar o resultado na propria matriz, nas posicoes correspondentes.
*/
import java.util.Scanner;

public class TP02Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo uma matriz de ordem 3x4 para armazenar os valores
        int[][] matriz = new int[3][4];

        // Preenchendo a matriz com os valores fornecidos pelo usuário
        System.out.println("Digite os doze valores para a matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Solicitando ao usuário uma constante multiplicativa
        System.out.print("Digite a constante multiplicativa: ");
        int constante = scanner.nextInt();

        // Multiplicando cada valor da matriz pela constante
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= constante;
            }
        }

        // Exibindo a matriz resultante
        System.out.println("\nMatriz resultante após multiplicação:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }

        scanner.close(); // Fechar o Scanner
    }
}
