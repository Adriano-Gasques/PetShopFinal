package br.com.PetShop.Classes;

public class Consulta {

    private int codigo;
    private double valorConsulta;
    private Agendamento agendamento;


    public Consulta(int codigo, double valorConsulta, Agendamento agendamento) {
        this.codigo = codigo;
        this.valorConsulta = valorConsulta;
        this.agendamento = agendamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    @Override
    public String toString() {
        return "\n*** Dados da Consulta ***" +
                "\nCódigo: " + this.codigo +
                "\nData: " + this.getAgendamento().getData() +
                "\nNome do animail consultado: " + this.getAgendamento().getAnimal().getNome() +
                "\nRaça do animal: " + this.getAgendamento().getAnimal().getRaca() +
                "\nVeterinário responsável: " + this.getAgendamento().getVeterinario().getNome() +
                " " + this.getAgendamento().getVeterinario().getSobrenome() +
                "\nCRMV do veterinário: " + this.getAgendamento().getVeterinario().getCmrv() +
                "\nValor da consulta: R$" + this.valorConsulta;
    }
}
