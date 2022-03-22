package br.com.PetShop.Classes;

import java.time.LocalDate;

public class Agendamento {

    private int codigo;
    private LocalDate data;
    private Animal animal;
    private Cliente cliente;

    public Agendamento(int codigo, LocalDate data, Animal animal, Cliente cliente) {
        this.codigo = codigo;
        this.data = data;
        this.animal = animal;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
