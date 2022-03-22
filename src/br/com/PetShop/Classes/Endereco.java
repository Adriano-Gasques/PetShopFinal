package br.com.PetShop.Classes;

public class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String complemento;
    private int numero;

    public Endereco() {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public int getNumero() {
        return numero;
    }
}
