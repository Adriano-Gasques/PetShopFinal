package br.com.PetShop.Classes;

public class Cliente {
    private int idade;
    private String nome;
    private String sobrenome;
    private int cpf;
    private String sexo;
    private String telefone;
    private Endereco endereco = new Endereco();

    public Cliente(int idade, String nome, String sobrenome, int cpf, String sexo, String telefone, Endereco endereco) {
        this.idade = idade;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
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
