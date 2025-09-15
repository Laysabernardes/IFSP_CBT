//Aluna: Laysa Bernardes Campos da Rocha - CB3024873 
//Aluno: Lucas Lopes Cruz - CB3025284 

package Pessoa;
public class Pessoa {
    private static int kp = 0; 
    private String nome;
    private char sexo;
    private int idade;

    public Pessoa() {
        kp++;
    }

    public Pessoa(String nome, char sexo, int idade) {
        this();
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    public void setKp() {
        kp++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static int getKp() {
        return kp;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }
}