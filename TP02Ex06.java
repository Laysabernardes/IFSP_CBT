// DUPLA: Laysa Bernardes e Lucas Lopes.
// EXERCICIO 6
// Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
import java.util.Scanner;

public class TP02Ex06 {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in); 
        String[][] array = new String[2][3]; // Declara uma matriz de ordem 2x3 para armazenar nomes

        // Loop para preencher a matriz com nomes fornecidos 
        for(int i = 0; i  < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                // Solicita ao usuário que digite o nome para a posição (i+1, j+1)
                System.out.print("Digite o nome na posição " + (i + 1) + ", " +(j + 1) + ": ");
                array[i][j] = scan.nextLine(); // Armazena o nome na matriz
            }
            System.out.println("\n"); // Adiciona uma linha em branco após cada linha de nomes
        }

        // Loop para exibir os nomes da matriz na tela
        for(int i = 0; i  < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(array[i][j]); // Exibe o nome
                System.out.print("|"); // Separador
            }
            System.out.print("\n"); 
            System.out.print("----"); 
            System.out.print("\n");
        }
        scan.close(); // Fecha o Scanner após o uso
    }
}
