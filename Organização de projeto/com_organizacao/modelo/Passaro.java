// Passaro herda de Animal e fica no pacote "modelo"
package com_organizacao.modelo;

public class Passaro extends Animal {
    private boolean voador;

    public Passaro(String nome, boolean voador) {
        super(nome);
        this.voador = voador;
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " faz: Piu piu!");
    }

    @Override
    public void exibir() {
        System.out.println("Pássaro: " + getNome() + " | Voa: " + (voador ? "Sim" : "Não"));
    }

    public boolean isVoador() {
        return voador;
    }
}
