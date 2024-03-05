import java.util.Scanner;
public class TP01Ex02 {
    
    public static void main(String args[]){
    //2 Calcular e exibir a Ã¡rea de um quadrado, a partir do valor de sua aresta que serÃ¡ digitado.
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor da aresta do quadrado");
        int aresta = scan.nextInt();
        int area = (aresta*aresta); 
        System.out.println("O valor da area : " +area);
        
    }
    
}
