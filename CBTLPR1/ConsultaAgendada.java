import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade = 0;
    private String nomeMedico;
    
    
    private static Scanner scan = new Scanner(System.in);
    
    // Construtor que permite a digitação dos valores
    public ConsultaAgendada() {
        setData();
        setHora();
        setNomePaciente();
        setNomeMedico();
        quantidade++;
    }
    
    // Construtor que recebe os valores de data, hora, nome do paciente e médico
    //não pode ser m1
    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String m1) {
        this.data = new Data(d, m, a);
        this.hora = new Hora(h, mi, s);
        this.nomePaciente = p;
        this.nomeMedico = m1;
        quantidade++;
    }
    
    // Construtor que recebe os valores de data, hora, nome do paciente e médico
    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
        quantidade++;
    }
    
    // Métodos set com digitação de novos valores
    public void setData() {
        System.out.print("Digite o dia: ");
        int d = scan.nextInt();
        System.out.print("Digite o mês: ");
        int m = scan.nextInt();
        System.out.print("Digite o ano: ");
        int a = scan.nextInt();
        this.data = new Data(d, m, a);
    }
    
    public void setHora() {
        System.out.print("Digite a hora: ");
        int h = scan.nextInt();
        System.out.print("Digite os minutos: ");
        int mi = scan.nextInt();
        System.out.print("Digite os segundos: ");
        int s = scan.nextInt();
        this.hora = new Hora(h, mi, s);
    }
    
    public void setNomePaciente() {
        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = scan.nextLine();
    }
    
    public void setNomeMedico() {
        System.out.print("Digite o nome do médico: ");
        this.nomeMedico = scan.nextLine();
    }
    
    // Métodos set com valores passados como parâmetros
    public void setData(int d, int m, int a) {
        this.data = new Data(d, m, a);
    }
    
    public void setHora(int h, int mi, int s) {
        this.hora = new Hora(h, mi, s);
    }
    
    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }
    
    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }
    
    // Métodos get para retornar os valores no formato especificado
    public String getData() {
        return data.mostra1(); // Método de Data para exibir no formato dd/mm/aa
    }
    
    public String getHora() {
        return hora.mostra(); // Método de Hora para exibir no formato hh:mm:ss
        //SOLUCIONOU O ERRO ADD METODO EM HORA.JAVA
    }
    
    public String getNomePaciente() {
        return nomePaciente;
    }
    
    public String getNomeMedico() {
        return nomeMedico;
    }
    
    // Método para retornar a quantidade de consultas agendadas
    public int getAmostra() {
        return quantidade;
    }
}
