// DUPLA: Laysa Bernardes e Lucas Lopes. 
/*
EXERCICIO 1
Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.
*/
import java.util.Scanner;

public class TP02Ex01 {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        // Solicitar ao usuário que digite o primeiro valor
        System.out.println("Digite o primeiro valor:");
        int num1 = scan.nextInt();

        // Solicitar ao usuário que digite o segundo valor
        System.out.println("\nDigite o segundo valor:");
        double num2 = scan.nextDouble();

        // Verificar se o segundo valor é maior que o primeiro
        while(num2 < num1)
        {
            // Se não for, solicitar ao usuário que digite novamente o segundo valor
            System.out.println("O segundo valor tem que ser maior que o primeiro");
            num2 = scan.nextDouble();
        }

        // Exibir os valores digitados pelo usuário
        System.out.println("O primeiro valor foi: " + num1);
        System.out.println("\nO segundo valor foi: " + num2);

        scan.close(); 
        // Fechar o Scanner após o uso
    }
}
