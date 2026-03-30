public class Atributos {
    // Atributos (ou variáveis de instância) são as propriedades de uma classe.
    // Cada objeto criado a partir da classe terá sua própria cópia desses atributos.
    String modelo;
    String fabricante;
    int kilometragem;

    public static void main(String[] args) {
        // Criando o primeiro objeto e definindo seus atributos
        Atributos carro1 = new Atributos();
        carro1.modelo = "Fusca";
        carro1.fabricante = "Volkswagen";
        carro1.kilometragem = 100000;

        // Criando o segundo objeto com atributos diferentes
        Atributos carro2 = new Atributos();
        carro2.modelo = "Civic";
        carro2.fabricante = "Honda";
        carro2.kilometragem = 50000;

        // Acessando os atributos de cada objeto
        System.out.println("=== Carro 1 ===");
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Fabricante: " + carro1.fabricante);
        System.out.println("Km: " + carro1.kilometragem);

        System.out.println("\n=== Carro 2 ===");
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Fabricante: " + carro2.fabricante);
        System.out.println("Km: " + carro2.kilometragem);

        // Modificando um atributo depois de criado
        carro2.kilometragem = 55000;
        System.out.println("\nKm atualizada do Carro 2: " + carro2.kilometragem);

        // Isso mostra que cada objeto é independente: mudar carro2 não afeta carro1
        System.out.println("Km do Carro 1 continua: " + carro1.kilometragem);
    }
}
