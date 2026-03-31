// Cachorro herda de Animal e fica no mesmo pacote "modelo"
package com_organizacao.modelo;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " faz: Au au!");
    }

    @Override
    public void exibir() {
        System.out.println("Cachorro: " + getNome() + " | Raça: " + raca);
    }

    public String getRaca() {
        return raca;
    }
}
