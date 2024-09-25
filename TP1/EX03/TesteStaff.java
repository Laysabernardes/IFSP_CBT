package EX03;
public class TesteStaff{
    public static void main(String[] args) {
        Staff professor = new Staff("Laysa", "Cubatão - SP", "IFSP Cubatão", 5000.00);
    
        System.out.println(professor.toString());
        
        professor.setAddress("Praia Grande - SP"); 
        professor.setSchool("Fatec");
        professor.setPay(7500.00);

        System.out.println(professor.getAddress()); 
        System.out.println(professor.getSchool());
        System.out.println(professor.getPay());
    }
}