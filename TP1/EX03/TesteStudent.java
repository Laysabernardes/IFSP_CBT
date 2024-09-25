package IFSP_4_LPR2.TP1.EX03;
public class TesteStudent{
    public static void main(String[] args) {
        Student aluno = new Student("Lucas", "Praia Grande - SP", "C#", 2023, 6.25);
    
        System.out.println(aluno.toString());
        
        aluno.setAddress("Cubatão - SP"); 
        aluno.setProgram("Java");
        aluno.setYear(2024);
        aluno.setFee(10.00);

        System.out.println(aluno.getAddress()); 
        System.out.println(aluno.getProgram());
        System.out.println(aluno.getYear());
        System.out.println(aluno.getFee());
    }
}