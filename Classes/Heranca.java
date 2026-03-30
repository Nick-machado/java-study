// Classe pai (superclasse): define o que todo veículo tem em comum
class Veiculo {
    String marca;
    int ano;

    Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    void buzinar() {
        System.out.println("BEEP BEEP!");
    }

    void exibirInfo() {
        System.out.println("Marca: " + marca + " | Ano: " + ano);
    }
}

// Classe filha (subclasse): herda tudo de Veiculo e adiciona coisas próprias.
// A palavra-chave "extends" indica que Carro é uma subclasse de Veiculo.
class Carro extends Veiculo {
    int portas;

    Carro(String marca, int ano, int portas) {
        super(marca, ano); // "super" chama o construtor da classe pai
        this.portas = portas;
    }

    void exibirDetalhes() {
        exibirInfo(); // Método herdado da classe pai
        System.out.println("Portas: " + portas);
    }
}

// Outra subclasse: Moto também herda de Veiculo
class Moto extends Veiculo {
    boolean temBau;

    Moto(String marca, int ano, boolean temBau) {
        super(marca, ano);
        this.temBau = temBau;
    }

    void exibirDetalhes() {
        exibirInfo();
        System.out.println("Tem baú: " + (temBau ? "Sim" : "Não"));
    }
}

// Classe principal para testar
public class Heranca {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", 2024, 4);
        Moto moto = new Moto("Honda", 2023, true);

        System.out.println("=== Carro ===");
        carro.exibirDetalhes();
        carro.buzinar(); // Método herdado de Veiculo

        System.out.println("\n=== Moto ===");
        moto.exibirDetalhes();
        moto.buzinar(); // Moto também herda buzinar()
    }
}
