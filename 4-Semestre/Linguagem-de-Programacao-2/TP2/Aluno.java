//Aluna: Laysa Bernardes Campos da Rocha - CB3024873 
//Aluno: Lucas Lopes Cruz - CB3025284 

import java.util.UUID;

class Aluno {
    private String nome;
    private String endereco;
    private int idade;
    private UUID uuid;

    public Aluno(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.uuid = UUID.randomUUID(); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public UUID getUuid() {
        return uuid;
    }
}