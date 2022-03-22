package br.com.PetShop.Classes;

public class Animal {

    private int idade;
    private String nome;
    private String raca;
    private String tipo;
    private String sexo;

    public Animal(int idade, String nome, String raca, String tipo, String sexo) {
        this.idade = idade;
        this.nome = nome;
        this.raca = raca;
        this.tipo = tipo;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "\n*** Dados do Animal ***" +
                "\n Nome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nRaça: " + this.raca +
                "\nEspécie: " + this.tipo +
                "\nSexo: " + this.sexo;
    }
}
