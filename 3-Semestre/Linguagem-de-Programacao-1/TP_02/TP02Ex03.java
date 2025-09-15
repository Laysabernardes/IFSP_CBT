// DUPLA: Laysa Bernardes e Lucas Lopes. 
/*
EXERCICIO 3
/*Entrar via teclado com 'N' valores quaisquer. O valor 'N' (que representa a quantidade de
    numeros) sera digitado, devera ser positivo, porem menor que vinte. Caso a quantidade não
    satisfaca a restricao, enviar mensagem de erro e solicitar o valor novamente. Apos a
    digitação dos 'N' valores, exibir:
    a. O maior valor;
    b. O menor valor;
    c. A soma dos valores;
    d. A media aritmetica dos valores;
    e. A porcentagem de valores que sao positivos;
    f. A porcentagem de valores negativos;
    
    Apos exibir os dados, perguntar ao usuario de deseja ou nao uma nova execucao do
    programa. Consistir a resposta no sentido de aceitar somente 'S' ou 'N' e encerrar o
    programa em funcao dessa resposta.
*/
import java.util.Scanner;


public class TP02Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar os resultados
        double maiorValor, menorValor, somaValores, mediaAritmetica, percentPositivos, percentNegativos;
        int quantidadeValores, valoresPositivos = 0, valoresNegativos = 0;

        char continuar;

        // Loop principal para permitir múltiplas execuções do programa
        do {
            // Solicitar ao usuário a quantidade de valores a serem digitados
            System.out.print("Digite a quantidade de valores (positivo, menor que 20): ");
            quantidadeValores = scanner.nextInt();

            // Verificar se a quantidade de valores está dentro das restrições
            while (quantidadeValores <= 0 || quantidadeValores >= 20) {
                System.out.println("A quantidade de valores deve ser positiva e menor que 20.");
                System.out.print("Digite novamente a quantidade de valores: ");
                quantidadeValores = scanner.nextInt();
            }

            // Inicializar as variáveis com o primeiro valor digitado
            System.out.print("Digite o 1º valor: ");
            double valor = scanner.nextDouble();
            maiorValor = valor;
            menorValor = valor;
            somaValores = valor;

            // Verificar se o valor é positivo ou negativo e atualizar as contagens
            if (valor > 0) {
                valoresPositivos++;
            } else if (valor < 0) {
                valoresNegativos++;
            }

            // Loop para digitar os demais valores e calcular as estatísticas
            for (int i = 1; i < quantidadeValores; i++) {
                System.out.print("Digite o " + (i + 1) + "º valor: ");
                valor = scanner.nextDouble();
                somaValores += valor;

                if (valor > maiorValor) {
                    maiorValor = valor;
                }
                if (valor < menorValor) {
                    menorValor = valor;
                }
                if (valor > 0) {
                    valoresPositivos++;
                } else if (valor < 0) {
                    valoresNegativos++;
                }
            }

            // Calcular média aritmética
            mediaAritmetica = somaValores / quantidadeValores;

            // Calcular porcentagens de valores positivos e negativos
            percentPositivos = (double) valoresPositivos / quantidadeValores * 100;
            percentNegativos = (double) valoresNegativos / quantidadeValores * 100;

            // Exibir os resultados
            System.out.println("\nResultados:");
            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Menor valor: " + menorValor);
            System.out.println("Soma dos valores: " + somaValores);
            System.out.println("Média aritmética: " + mediaAritmetica);
            System.out.println("Porcentagem de valores positivos: " + percentPositivos + "%");
            System.out.println("Porcentagem de valores negativos: " + percentNegativos + "%");

            // Perguntar ao usuário se deseja continuar
            System.out.print("\nDeseja executar o programa novamente? (S/N): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        // Fechar o Scanner
        scanner.close();
    }
}
