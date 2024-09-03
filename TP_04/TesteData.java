// DUPLA: Laysa Bernardes e Lucas Lopes
// Trabalho prático 4

public class TesteData {
    public static void main(String[] args) {

        // Testando o construtor que permite ao usuário digitar os valores
        Data data1 = new Data();
        System.out.println("----------------------------------------------------");
        System.out.println("------------- Data digitada:  ----------------------");
        System.out.println("Ano: " + data1.retAno());
        System.out.println("Mes: " + data1.retMes());
        System.out.println("Dia: " + data1.retDia());
        System.out.println("Bissexto: "+ data1.bissexto());
        System.out.println("Método Mostra 1: " + data1.mostra1());
        System.out.println("Método Mostra 2: " +data1.mostra2());
        System.out.println("Dias Transcorrido: " + data1.diasTranscorridos());
        System.out.print("\n");
        System.out.println("----------------------------------------------------");


        // Testando o construtor que recebe os valores de dia, mês e ano
        Data data2 = new Data(15, 8, 2023);
        System.out.println("------------- Data inicializada --------------------");
        System.out.println("Ano: " + data2.retAno());
        System.out.println("Mes: " + data2.retMes());
        System.out.println("Dia: " + data2.retDia());
        System.out.println("Bissexto: "+ data2.bissexto());
        System.out.println("Método Mostra 1: " + data2.mostra1());
        System.out.println("Método Mostra 2: " + data2.mostra2());
        System.out.println("Dias Transcorrido: " + data2.diasTranscorridos());
        System.out.print("\n");
        System.out.println("----------------------------------------------------");


        // Testando o método apresentaDataAtual
        System.out.println("-------------------- Data Atual --------------------");
        data2.apresentaDataAtual();
        System.out.print("\n");

    }
}
