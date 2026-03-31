// Gato herda de Animal e fica no mesmo pacote "modelo"
package com_organizacao.modelo;

public class Gato extends Animal {
    private boolean domestico;

    public Gato(String nome, boolean domestico) {
        super(nome);
        this.domestico = domestico;
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " faz: Miau!");
    }

    @Override
    public void exibir() {
        System.out.println("Gato: " + getNome() + " | Doméstico: " + (domestico ? "Sim" : "Não"));
    }

    public boolean isDomestico() {
        return domestico;
    }
}
