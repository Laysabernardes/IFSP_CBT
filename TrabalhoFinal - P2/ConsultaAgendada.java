import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    private static int quantidade = 0;

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
    // A String m foi atualizada para m1 para evitar erro
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

    // Métodos set com valores passados como parâmetros
    public void setData(int a, int b, int c) {
        this.data.setDia(a);
        this.data.setMes(b);
        this.data.setAno(c);   
    }

    public void setData() {
        while (true) {
            try {
                this.data = new Data();
                break;
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage() + " Tente novamente.");
                scan.next();
            }
        }
    }

    public void setHora(int a, int b, int c) {
        this.hora = new Hora(a, b, c);
    }

    public void setHora() {
        while (true) {
            try {
                this.hora = new Hora();
                break;
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage() + " Tente novamente.");
                scan.next();
            }
        }
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomePaciente() {
        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = scan.nextLine();
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    public void setNomeMedico() {
        System.out.print("Digite o nome do médico: ");
        this.nomeMedico = scan.nextLine();
    }

    public static int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return data.mostra1(); // Método de Data para exibir no formato dd/mm/aa
    }

    public String getHora() {
        return hora.mostra(); // Método de Hora para exibir no formato hh:mm:ss
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }
}