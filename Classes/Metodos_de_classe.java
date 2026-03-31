// Métodos de Classe — tudo sobre métodos dentro de uma classe.
//
// Até agora a gente viu métodos soltos (na seção de Métodos), mas aqui
// o foco é como métodos funcionam DENTRO de uma classe: instância vs static,
// sobrecarga, e o uso do "this" pra chamar outros métodos da mesma classe.

public class Metodos_de_classe {

    // === Atributos ===
    private String nome;
    private int nivel;

    // Atributo static: pertence à classe, compartilhado entre todos os objetos
    private static int totalPersonagens = 0;

    // === Construtor ===
    Metodos_de_classe(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
        totalPersonagens++;
    }

    // === Métodos de instância ===
    // Precisam de um objeto pra ser chamados: personagem.atacar()

    void atacar() {
        System.out.println(nome + " ataca com força " + calcularDano() + "!");
    }

    // Um método de instância pode chamar OUTRO método da mesma classe com this
    // (ou sem this, já que o Java entende que é da mesma instância)
    void apresentar() {
        System.out.println("Eu sou " + this.getNome() + ", nível " + nivel);
        // this.getNome() é o mesmo que getNome() aqui dentro
    }

    // Getter — método de instância que retorna um atributo
    String getNome() {
        return nome;
    }

    // Método privado: só pode ser chamado dentro desta classe
    private int calcularDano() {
        return nivel * 10;
    }

    // === Sobrecarga de métodos (Method Overloading) ===
    // Mesmo nome, parâmetros diferentes. O Java escolhe qual chamar
    // com base nos argumentos que você passa.

    void curar() {
        // Cura padrão de 20
        this.nivel += 1;
        System.out.println(nome + " se curou! Novo nível: " + nivel);
    }

    void curar(int bonus) {
        // Cura com bônus
        this.nivel += bonus;
        System.out.println(nome + " se curou com bônus! Novo nível: " + nivel);
    }

    void curar(int bonus, String fonte) {
        // Cura com bônus e fonte
        this.nivel += bonus;
        System.out.println(nome + " recebeu cura de " + fonte + "! Novo nível: " + nivel);
    }

    // === Método static ===
    // Pertence à CLASSE, não ao objeto. Chamado com: Metodos_de_classe.getTotal()
    // Não pode acessar atributos de instância (nome, nivel) porque não tem objeto.
    // Só pode acessar outros membros static.

    static int getTotal() {
        return totalPersonagens;
    }

    static void exibirStatus() {
        System.out.println("Total de personagens criados: " + totalPersonagens);
        // System.out.println(nome); // ERRO! "nome" é de instância, static não acessa
    }

    // === Main ===
    public static void main(String[] args) {

        // --- Métodos de instância ---
        System.out.println("=== Métodos de instância ===");
        Metodos_de_classe guerreiro = new Metodos_de_classe("Arthas", 5);
        Metodos_de_classe mago = new Metodos_de_classe("Gandalf", 8);

        guerreiro.apresentar();  // Eu sou Arthas, nível 5
        mago.apresentar();       // Eu sou Gandalf, nível 8
        guerreiro.atacar();      // Arthas ataca com força 50!
        mago.atacar();           // Gandalf ataca com força 80!

        // --- Sobrecarga ---
        System.out.println("\n=== Sobrecarga de métodos ===");
        guerreiro.curar();              // curar() sem parâmetros
        guerreiro.curar(3);             // curar(int) com bônus
        guerreiro.curar(2, "Poção");    // curar(int, String) com bônus e fonte

        // --- Métodos static ---
        System.out.println("\n=== Métodos static ===");
        // Chamado pela CLASSE, não por um objeto
        Metodos_de_classe.exibirStatus();
        System.out.println("Total: " + Metodos_de_classe.getTotal()); // 2

        // Tecnicamente funciona chamar static por um objeto, mas é má prática:
        // guerreiro.getTotal(); // Funciona, mas o Java avisa que não devia

        // --- Método privado ---
        System.out.println("\n=== Método privado ===");
        // guerreiro.calcularDano(); // ERRO! calcularDano() é private
        // Ele é usado internamente pelo atacar(), mas não é acessível de fora.
        guerreiro.atacar(); // atacar() usa calcularDano() por dentro
    }
}
