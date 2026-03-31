// PROBLEMA: Tudo num arquivo só.
// Funciona? Funciona. Mas conforme o projeto cresce, vira uma bagunça.
//
// Em Java, só PODE ter UMA classe pública por arquivo, e o nome do arquivo
// TEM que ser igual ao da classe pública. Mas classes sem "public" podem
// ficar no mesmo arquivo (como fizemos em Heranca.java e Polimorfismo.java).
//
// Quando você tem 5, 10, 20 classes... colocar tudo junto fica inviável.
// É como guardar todas as suas roupas num saco só: tecnicamente funciona,
// mas achar algo é um pesadelo.

// Classe base
class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }

    void fazerSom() {
        System.out.println(nome + " faz algum som...");
    }

    void exibir() {
        System.out.println("Animal: " + nome);
    }
}

// Subclasse 1
class Cachorro extends Animal {
    String raca;

    Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    void fazerSom() {
        System.out.println(nome + " faz: Au au!");
    }

    @Override
    void exibir() {
        System.out.println("Cachorro: " + nome + " | Raça: " + raca);
    }
}

// Subclasse 2
class Gato extends Animal {
    boolean domestico;

    Gato(String nome, boolean domestico) {
        super(nome);
        this.domestico = domestico;
    }

    @Override
    void fazerSom() {
        System.out.println(nome + " faz: Miau!");
    }

    @Override
    void exibir() {
        System.out.println("Gato: " + nome + " | Doméstico: " + (domestico ? "Sim" : "Não"));
    }
}

// Subclasse 3
class Passaro extends Animal {
    boolean voador;

    Passaro(String nome, boolean voador) {
        super(nome);
        this.voador = voador;
    }

    @Override
    void fazerSom() {
        System.out.println(nome + " faz: Piu piu!");
    }

    @Override
    void exibir() {
        System.out.println("Pássaro: " + nome + " | Voa: " + (voador ? "Sim" : "Não"));
    }
}

// "Serviço" que gerencia os animais
class AnimalServico {
    Animal[] animais;
    int quantidade = 0;

    AnimalServico(int capacidade) {
        animais = new Animal[capacidade];
    }

    void adicionar(Animal animal) {
        if (quantidade < animais.length) {
            animais[quantidade] = animal;
            quantidade++;
        } else {
            System.out.println("Capacidade máxima atingida!");
        }
    }

    void listarTodos() {
        System.out.println("=== Lista de Animais (" + quantidade + ") ===");
        for (int i = 0; i < quantidade; i++) {
            animais[i].exibir();
        }
    }

    void todosOsSons() {
        System.out.println("=== Sons ===");
        for (int i = 0; i < quantidade; i++) {
            animais[i].fazerSom();
        }
    }
}

// Classe principal — a única que pode ser public neste arquivo
public class Tudo_junto {
    public static void main(String[] args) {
        // Funciona perfeitamente, mas imagina isso com 20+ classes...
        AnimalServico servico = new AnimalServico(10);

        servico.adicionar(new Cachorro("Rex", "Pastor Alemão"));
        servico.adicionar(new Gato("Mimi", true));
        servico.adicionar(new Passaro("Blu", true));
        servico.adicionar(new Cachorro("Bob", "Golden Retriever"));

        servico.listarTodos();
        System.out.println();
        servico.todosOsSons();

        // O código acima funciona, mas perceba que temos 6 classes
        // (Animal, Cachorro, Gato, Passaro, AnimalServico, Tudo_junto)
        // todas empilhadas num arquivo só. Isso não escala.
        //
        // A solução? Separar cada classe no seu próprio arquivo,
        // organizar em pacotes (packages), e ter uma estrutura limpa.
        // Veja o exemplo na pasta "com_organizacao/" deste mesmo diretório.
    }
}
