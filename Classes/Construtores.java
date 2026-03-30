public class Construtores {
    // Atributos da classe
    String modelo;
    String fabricante;
    int kilometragem;

    // Construtor: é um método especial que é chamado automaticamente quando
    // um objeto é criado com "new". O nome do construtor deve ser IGUAL ao da classe.
    // Ele não tem tipo de retorno (nem void).
    Construtores(String modelo, String fabricante, int kilometragem) {
        // "this" se refere ao objeto atual, diferenciando o atributo do parâmetro
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.kilometragem = kilometragem;
    }

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Km: " + kilometragem);
    }

    public static void main(String[] args) {
        // Agora ao invés de definir atributo por atributo, passamos tudo no construtor
        Construtores carro1 = new Construtores("Fusca", "Volkswagen", 100000);
        Construtores carro2 = new Construtores("Civic", "Honda", 50000);

        System.out.println("=== Carro 1 ===");
        carro1.exibirInformacoes();

        System.out.println("\n=== Carro 2 ===");
        carro2.exibirInformacoes();
    }
}
