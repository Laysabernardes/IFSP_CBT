public class TesteConsultaAgendada {
    public static void main(String[] args) {

        // Usando o construtor ConsultaAgendada (int h, int mi, int s, int d, int m, int
        // a, String p, String m1)
        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 12, 8, 2024, "João Silva", "Dr. Carlos");

        // Exibindo todas as propriedades de p1
        System.out.println("----------------------------------------------------");
        System.out.println("----------- Propriedades de p1  --------------------");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println("Quantidade de consultas agendadas: " + ConsultaAgendada.getAmostra());
        System.out.println("----------------------------------------------------");
        System.out.println();

        // Instanciando o objeto p2 usando o construtor ConsultaAgendada ()
        ConsultaAgendada p2 = new ConsultaAgendada();
        System.out.println("----------------------------------------------------");
        System.out.println("----------- Propriedades de p2  --------------------");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("Nome do Médico: " + p2.getNomeMedico());
        System.out.println("Quantidade de consultas agendadas: " + ConsultaAgendada.getAmostra());
        System.out.println("----------------------------------------------------");
        System.out.println();

        // Alterando as propriedades de p1 usando os métodos setData(), setHora(),
        // setNomePaciente(), setNomeMedico()
        System.out.println("----------------------------------------------------");
        System.out.println("----------- Alterando dados de p1 ------------------");
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        // Exibindo todas as propriedades de p1 novamente
        System.out.println("----------------------------------------------------");
        System.out.println("------- Propriedades de p1 após alterações ---------");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println("Quantidade de consultas agendadas: " + ConsultaAgendada.getAmostra());
        System.out.println();

        // Exibindo a quantidade final de consultas
        System.out.println("----------- Consultas Agendadas --------------------");
        System.out.println("Quantidade final de consultas agendadas: " + ConsultaAgendada.getAmostra());
        System.out.println("----------------------------------------------------");
        System.out.println("\n");
    }
}