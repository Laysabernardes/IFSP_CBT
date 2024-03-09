// DUPLA: Laysa Bernardes e Lucas Lopes. 
//EXERCICIO: 16 - Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo. Lembre-se que uma função trigonométrica trabalha em radianos.
import java.util.Scanner; 
// Importa a classe Scanner para entrada de dados
import java.lang.Math; // Importa a classe Math para funções matemáticas

public class TP01Ex16 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para receber entrada do usuário
        Scanner scan = new Scanner(System.in);
        
        // Solicita ao usuário que insira o valor do ângulo em graus
        System.out.println("Insira o valor do ângulo em graus:");
        
        // Lê o valor do ângulo fornecido pelo usuário
        double anguloGraus = scan.nextDouble();
        
        // Converte o ângulo de graus para radianos
        double anguloRadianos = Math.toRadians(anguloGraus);
        
        // Calcula o seno do ângulo
        double seno = Math.sin(anguloRadianos);
        
        // Calcula o cosseno do ângulo
        double cosseno = Math.cos(anguloRadianos);
        
        // Calcula a tangente do ângulo
        double tangente = Math.tan(anguloRadianos);
        
        // Calcula a secante do ângulo
        double secante = 1 / cosseno;
        
        // Exibe as funções trigonométricas calculadas
        System.out.println("Seno do ângulo: " + seno);
        System.out.println("Cosseno do ângulo: " + cosseno);
        System.out.println("Tangente do ângulo: " + tangente);
        System.out.println("Secante do ângulo: " + secante);
        
        // Fecha o Scanner para liberar recursos
        scan.close();
    }
}
