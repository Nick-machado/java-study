// Classe base: Animal
// Em um projeto organizado, cada classe fica no seu próprio arquivo.
// O "package" indica em qual pacote (pasta) essa classe mora.
package com_organizacao.modelo;

public class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void fazerSom() {
        System.out.println(nome + " faz algum som...");
    }

    public void exibir() {
        System.out.println("Animal: " + nome);
    }

    public String getNome() {
        return nome;
    }
}
