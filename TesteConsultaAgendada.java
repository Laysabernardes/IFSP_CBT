public class TesteConsultaAgendada {
    public static void main(String[] args) {
        
        // Usando o construtor ConsultaAgendada (int h, int mi, int s, int d, int m, int a, String p, String m)
        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 12, 8, 2024, "João Silva", "Dr. Carlos");
        
        // Exibindo todas as propriedades de p1
        System.out.println("----------------------------------------------------");
        System.out.println("----------- Propriedades de p1  --------------------");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println();
        
        // Instanciando o objeto p2 usando o construtor ConsultaAgendada ()
        ConsultaAgendada p2 = new ConsultaAgendada();
        
        // Exibindo todas as propriedades de p2
        System.out.println("----------------------------------------------------");
        System.out.println("----------- Propriedades de p2  --------------------");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("Nome do Médico: " + p2.getNomeMedico());
        System.out.println();
        
        // Alterando as propriedades de p1 usando os métodos setData(), setHora(), setNomePaciente(), setNomeMedico()
        p1.setData(25, 12, 2024);
        p1.setHora(14, 45, 30);
        p1.setNomePaciente("Maria Oliveira");
        p1.setNomeMedico("Dr. Ana");
        
        // Exibindo todas as propriedades de p1 novamente
        System.out.println("----------------------------------------------------");
        System.out.println("------- Propriedades de p1 após alterações ---------");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println();
        
        // Exibindo a quantidade final de consultas
        System.out.println("----------------------------------------------------");
        System.out.println("Quantidade final de consultas agendadas: " + p1.getAmostra());
    }
}
