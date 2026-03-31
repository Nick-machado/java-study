// Serviço que gerencia os animais — fica no pacote "servico"
// Ele importa as classes do pacote "modelo" porque precisa usá-las.
package com_organizacao.servico;

import com_organizacao.modelo.Animal;

public class AnimalServico {
    private Animal[] animais;
    private int quantidade = 0;

    public AnimalServico(int capacidade) {
        animais = new Animal[capacidade];
    }

    public void adicionar(Animal animal) {
        if (quantidade < animais.length) {
            animais[quantidade] = animal;
            quantidade++;
        } else {
            System.out.println("Capacidade máxima atingida!");
        }
    }

    public void listarTodos() {
        System.out.println("=== Lista de Animais (" + quantidade + ") ===");
        for (int i = 0; i < quantidade; i++) {
            animais[i].exibir();
        }
    }

    public void todosOsSons() {
        System.out.println("=== Sons ===");
        for (int i = 0; i < quantidade; i++) {
            animais[i].fazerSom();
        }
    }

    public int getQuantidade() {
        return quantidade;
    }
}
