public class TesteHora {
    public static void main(String[] args)
    {
        Hora h1 = new Hora();
        System.out.println("Hora 1: " + h1.getHora1());
        System.out.println("Hora 2: " + h1.getHora2());
        System.out.println("Total segundos: " + h1.getSegundos());

        Hora h2 = new Hora(15, 30, 45);
        System.out.println("\nHora 1: " + h2.getHora1());
        System.out.println("Hora 2: " + h2.getHora2());
        System.out.println("Total segundos: " + h2.getSegundos()  + "\n");

        Hora h3 = new Hora ();
        h3.setHor(22);
        h3.setMin(22);
        h3.setSeg(59);
        System.out.println("Horas: " + h3.getHor());
        System.out.println("Minutos: " + h3.getMin());
        System.out.println("Total segundos: " + h2.getSegundos());
    }
}