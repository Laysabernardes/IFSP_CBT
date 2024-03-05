import java.util.Scanner;
public class TP01Ex04 {
    
    public static void main(String args[]){
    //4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor da base do Triangulo");
        int base = scan.nextInt();
        System.out.println("Insira o valor da area do Triangulo");
        int altura = scan.nextInt();
        int area = (base*altura); 
        System.out.println("O valor da area : " +area);
        
    }
    
}
