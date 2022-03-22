package br.com.PetShop.Classes;

public class Funcionario {

    private int codigo;
    private String nome;
    private String sobrenome;
    private int cpf;
    private String sexo;
    private double salario;

    public Funcionario(int codigo, String nome, String sobrenome, int cpf, String sexo, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
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

    public double getSalario() {
        return salario;
    }
}
