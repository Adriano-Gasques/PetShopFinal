package br.com.PetShop.Classes;

public class Veterinario extends Funcionario{

    private String crmv;

    public Veterinario(int codigo, String nome, String sobrenome, int cpf, String sexo, double salario, String crmv) {
        super(codigo, nome, sobrenome, cpf, sexo, salario);
        this.crmv = crmv;
    }

    public String getCmrv() {
        return crmv;
    }

    @Override
    public String toString() {
        return "\n*** Dados do Funcionário ***" +
                "\nCargo: Veterinário" +
                "\nCRMV: " + this.crmv + super.toString();
    }
}
