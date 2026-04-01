public class Throw_throws {
    // === THROW ===
    // A palavra-chave "throw" permite LANÇAR uma exceção manualmente.
    // Você cria o erro e joga pra cima, forçando quem chamou a tratar.

    // === THROWS ===
    // A palavra-chave "throws" na assinatura do método AVISA que
    // aquele método PODE lançar uma exceção. Quem chamar precisa tratar.

    // Método que LANÇA exceção com throw
    static void verificarIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa: " + idade);
        }
        if (idade < 18) {
            throw new ArithmeticException("Menor de idade: " + idade);
        }
        System.out.println("Idade " + idade + " é válida! Acesso permitido.");
    }

    // Método que DECLARA que pode lançar exceção (throws)
    // Checked exceptions OBRIGAM o throws na assinatura
    static void lerArquivo(String caminho) throws java.io.IOException {
        if (caminho == null || caminho.isEmpty()) {
            throw new java.io.IOException("Caminho do arquivo inválido!");
        }
        System.out.println("Lendo arquivo: " + caminho);
    }

    // Método com validação usando throw
    static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        // === TESTANDO THROW ===
        System.out.println("=== Throw ===");

        // Caso válido
        verificarIdade(25); // Idade 25 é válida!

        // Caso inválido: capturando a exceção lançada
        try {
            verificarIdade(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        try {
            verificarIdade(15);
        } catch (ArithmeticException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        // === TESTANDO THROWS ===
        System.out.println("\n=== Throws ===");

        // Quando um método tem "throws", SOMOS OBRIGADOS a usar try-catch
        try {
            lerArquivo("dados.txt"); // Funciona
            lerArquivo("");           // Vai lançar IOException
        } catch (java.io.IOException e) {
            System.out.println("Erro de I/O: " + e.getMessage());
        }

        // === TESTANDO DIVISÃO ===
        System.out.println("\n=== Divisão segura ===");

        try {
            System.out.println("10 / 3 = " + dividir(10, 3));
            System.out.println("10 / 0 = " + dividir(10, 0)); // Lança exceção
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // === THROW vs THROWS: RESUMO ===
        System.out.println("\n=== Resumo ===");
        System.out.println("throw  → LANÇA uma exceção (dentro do método)");
        System.out.println("throws → DECLARA que o método pode lançar (na assinatura)");
    }
}
