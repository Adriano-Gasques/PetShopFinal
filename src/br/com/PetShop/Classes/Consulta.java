package br.com.PetShop.Classes;

import java.time.LocalDate;

public class Consulta {

    private int codigo;
    private LocalDate data;
    private Veterinario veterinario;
    private Animal animal;
    private double valorConsulta;

    public Consulta(int codigo, LocalDate data, Veterinario veterinario, Animal animal, double valorConsulta) {
        this.codigo = codigo;
        this.data = data;
        this.veterinario = veterinario;
        this.animal = animal;
        this.valorConsulta = valorConsulta;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public Animal getAnimal() {
        return animal;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }
}
