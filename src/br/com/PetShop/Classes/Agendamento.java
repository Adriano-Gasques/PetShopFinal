package br.com.PetShop.Classes;

public class Agendamento {

    private int codigo;
    private String data;
    private Animal animal;
    private Cliente cliente;
    private Veterinario veterinario;

    public Agendamento(int codigo, String data, Animal animal, Cliente cliente, Veterinario veterinario) {
        this.codigo = codigo;
        this.data = data;
        this.animal = animal;
        this.cliente = cliente;
        this.veterinario = veterinario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    @Override
    public String toString() {
        return "\n*** Dados do Agendamento ***" +
                "\nCódigo: " + this.codigo +
                "\nData do agendamento da consulta: " + this.data +
                "\nNome do animail: " + this.getAnimal().getNome() +
                "\nRaça do animal: " + this.getAnimal().getRaca() +
                "\nNome do proprietário do animal: " + this.getCliente().getNome() +
                " " + this.getCliente().getSobrenome() +
                "\nCPF do proprietário: " + this.getCliente().getCpf() +
                "\nTelefone para contato: " + this.getCliente().getTelefone() +
                "\nVeterinário responsável: " + this.getVeterinario().getNome() +
                " " + this.getVeterinario().getSobrenome() +
                "\nCRMV do veterinário: " + this.getVeterinario().getCmrv();
    }
}
