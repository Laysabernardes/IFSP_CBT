package TP1;

public class Author{
    //3 atributos privados name (String), email (String), and gender (char contendo 'm' or 'f'); 
    private String name;
    private String email;
    private char gender;

    //um construtor para inicializar os atributos com base nos 3 parâmetros.
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    //getters
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    //setter para email
    public void setEmail(String email){
        this.email = email;
    }

    //metodo toString
    public String toString(){
        return "Author[name=" + name + ", email=" + email + ",gender=" + gender + "]";
    }
}