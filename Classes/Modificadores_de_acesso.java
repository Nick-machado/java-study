public class Modificadores_de_acesso {
    // public: acessível por qualquer classe, de qualquer lugar.
    public String nome = "Nicolau";

    // private: acessível SOMENTE dentro da própria classe.
    // Se alguém tentar acessar de fora, o compilador vai reclamar.
    private int idade = 22;

    // protected: acessível dentro do mesmo pacote e por subclasses (herança).
    protected String cidade = "São Paulo";

    // default (sem modificador): acessível apenas dentro do mesmo pacote.
    String pais = "Brasil";

    // Para acessar atributos privados de fora, usamos métodos públicos
    public int getIdade() {
        return idade;
    }

    // static: pertence à classe, não ao objeto. Todos os objetos compartilham o mesmo valor.
    static String especie = "Humano";

    // final: o valor não pode ser alterado depois de definido. É uma constante.
    final String tipo = "Estudante";

    public static void main(String[] args) {
        Modificadores_de_acesso pessoa = new Modificadores_de_acesso();

        // Acessando atributos public, protected e default (todos no mesmo arquivo/pacote)
        System.out.println("Nome (public): " + pessoa.nome);
        System.out.println("Cidade (protected): " + pessoa.cidade);
        System.out.println("País (default): " + pessoa.pais);

        // Atributo private: só pode ser acessado pelo método getter
        // System.out.println(pessoa.idade); // ERRO! idade é private
        System.out.println("Idade (via getter): " + pessoa.getIdade());

        // Atributo static: pode ser acessado direto pela classe, sem criar objeto
        System.out.println("Espécie (static): " + Modificadores_de_acesso.especie);

        // Atributo final: é constante, não pode ser alterado
        System.out.println("Tipo (final): " + pessoa.tipo);
        // pessoa.tipo = "Professor"; // ERRO! final não pode ser reatribuído
    }
}
