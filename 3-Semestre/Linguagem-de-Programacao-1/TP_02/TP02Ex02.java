// DUPLA: Laysa Bernardes e Lucas Lopes. 
/*
EXERCICIO 2 
Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.
*/
import java.util.Scanner; 
// Importa a classe Scanner para entrada de dadosimport java.util.Scanner;

public class TP02Ex02 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        // Array para armazenar os valores digitados
        double[] num = new double[10];

        // Preenchendo o array com valores digitados pelo usuário
        for(int i = 0; i < num.length; i++)
        {
            // Solicita ao usuário para digitar o valor
            do
            {
                System.out.println("Digite o " + (i + 1) + "o. valor");
                num[i] = scan.nextDouble();

                // Verifica se o valor é positivo
                if(num[i] <= 0)
                {
                    System.out.println("Digite um valor positivo.");
                }
            } while(num[i] <= 0); // Repete enquanto o valor digitado for não positivo
        }

        // Encontrando o maior número digitado
        double maiorNum = num[0];

        for(int k = 0; k < num.length; k++)
        {
            if(num[k] > maiorNum)
                maiorNum = num[k];
        }

        double somaValores = 0;
        // Calculando a soma dos valores
        for(int s = 0; s <  num.length; s++)
        {
            somaValores += num[s];
        }

        // Exibindo os resultados
        System.out.println("\n A - Maior valor: " + maiorNum);
        System.out.println("\n B - Menor valor: " + somaValores);
        System.out.println("\n C - Média artimetica dos valores:  " + (somaValores / num.length));

        scan.close(); 
        // Fechar o Scanner após o uso
    }
}
