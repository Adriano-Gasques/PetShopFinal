package br.com.PetShop.Classes;

public class Cliente {
    private int idade;
    private String nome;
    private String Sobrenome;
    private int cpf;
    private String sexo;
    private Endereco endereco = new Endereco();

    public Cliente(int idade, String nome, String sobrenome, int cpf, String sexo, Endereco endereco) {
        this.idade = idade;
        this.nome = nome;
        Sobrenome = sobrenome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public int getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
