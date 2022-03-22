package br.com.PetShop.Classes;

public class Secretaria extends Funcionario{

    public Secretaria(int codigo, String nome, String sobrenome, int cpf, String sexo, double salario) {
        super(codigo, nome, sobrenome, cpf, sexo, salario);
    }

    @Override
    public String toString() {
        return "\n*** Dados do Funcionário ***" +
                "\nCargo: Secretária" + super.toString();
    }
}
