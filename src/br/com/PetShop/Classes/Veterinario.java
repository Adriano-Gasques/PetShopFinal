package br.com.PetShop.Classes;

public class Veterinario extends Funcionario{

    private String cmrv;

    public Veterinario(int codigo, String nome, String sobrenome, int cpf, String sexo, double salario, String cmrv) {
        super(codigo, nome, sobrenome, cpf, sexo, salario);
        this.cmrv = cmrv;
    }

    public String getCmrv() {
        return cmrv;
    }
}
