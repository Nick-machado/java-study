// Polimorfismo = "muitas formas". O mesmo método pode se comportar de
// maneiras diferentes dependendo de qual classe o implementa.

class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }

    // Método que será "sobrescrito" (override) pelas subclasses
    void fazerSom() {
        System.out.println(nome + " faz algum som...");
    }
}

class Cachorro extends Animal {
    Cachorro(String nome) {
        super(nome);
    }

    // Sobrescrevendo o método da classe pai com comportamento específico
    @Override
    void fazerSom() {
        System.out.println(nome + " faz: Au au!");
    }
}

class Gato extends Animal {
    Gato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + " faz: Miau!");
    }
}

class Pato extends Animal {
    Pato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + " faz: Quack!");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        // Aqui está a mágica do polimorfismo:
        // A variável é do tipo Animal (classe pai), mas o objeto é de uma subclasse.
        // O Java sabe qual versão do método chamar com base no objeto real.
        Animal animal1 = new Cachorro("Rex");
        Animal animal2 = new Gato("Mimi");
        Animal animal3 = new Pato("Donald");

        // Mesmo chamando fazerSom() em variáveis do tipo Animal,
        // cada um executa sua própria versão do método.
        System.out.println("=== Polimorfismo em ação ===");
        animal1.fazerSom(); // Au au!
        animal2.fazerSom(); // Miau!
        animal3.fazerSom(); // Quack!

        // Isso é muito útil pra tratar objetos diferentes de forma uniforme.
        // Por exemplo, podemos colocar todos em um array de Animal:
        System.out.println("\n=== Usando array ===");
        Animal[] animais = {animal1, animal2, animal3};
        for (Animal a : animais) {
            a.fazerSom();
        }
    }
}
