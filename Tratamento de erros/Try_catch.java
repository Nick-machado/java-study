public class Try_catch {
    public static void main(String[] args) {
        // Try-Catch: mecanismo para CAPTURAR e TRATAR erros em tempo de execução.
        // Sem try-catch, qualquer erro derruba o programa inteiro.
        // Com try-catch, você "pega" o erro e decide o que fazer com ele.

        // === TRY-CATCH BÁSICO ===
        System.out.println("=== Try-Catch Básico ===");

        // Sem try-catch, isso derrubaria o programa:
        // int resultado = 10 / 0; // ArithmeticException!

        // Com try-catch, a gente trata:
        try {
            int resultado = 10 / 0; // Vai dar erro!
        } catch (ArithmeticException e) {
            System.out.println("Erro: não pode dividir por zero!");
            System.out.println("Mensagem técnica: " + e.getMessage());
        }
        System.out.println("Programa continua rodando normalmente!\n");

        // === MÚLTIPLOS CATCH ===
        System.out.println("=== Múltiplos Catch ===");
        // Cada tipo de erro pode ser tratado de forma diferente

        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[10]); // ArrayIndexOutOfBoundsException!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora dos limites do array!");
        } catch (ArithmeticException e) {
            System.out.println("Erro: problema matemático!");
        } catch (Exception e) {
            // Exception genérica: pega QUALQUER erro que não foi tratado acima
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        // === TRY-CATCH-FINALLY ===
        System.out.println("\n=== Try-Catch-Finally ===");
        // O bloco finally SEMPRE executa, deu erro ou não.
        // Útil pra liberar recursos (fechar arquivos, conexões, etc.)

        try {
            int resultado = 10 / 2; // Funciona normal
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Deu erro!");
        } finally {
            System.out.println("Finally: isso SEMPRE executa!");
        }

        System.out.println(); // Separador

        // Testando finally quando DÁ erro:
        try {
            int resultado = 10 / 0; // Vai dar erro!
            System.out.println("Isso não vai imprimir");
        } catch (ArithmeticException e) {
            System.out.println("Erro capturado!");
        } finally {
            System.out.println("Finally: executou mesmo com erro!");
        }

        // === ERROS COMUNS ===
        System.out.println("\n=== Erros Comuns ===");

        // NullPointerException: tentar usar algo que é null
        try {
            String texto = null;
            System.out.println(texto.length()); // NullPointerException!
        } catch (NullPointerException e) {
            System.out.println("Erro: tentou acessar algo que é null!");
        }

        // NumberFormatException: converter texto inválido pra número
        try {
            int numero = Integer.parseInt("abc"); // Não é número!
        } catch (NumberFormatException e) {
            System.out.println("Erro: 'abc' não é um número válido!");
        }

        // StringIndexOutOfBoundsException: acessar posição inválida na string
        try {
            String nome = "Java";
            char letra = nome.charAt(10); // Só tem 4 caracteres!
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Erro: posição inválida na string!");
        }

        // === PEGANDO INFORMAÇÕES DO ERRO ===
        System.out.println("\n=== Informações do Erro ===");
        try {
            int[] arr = new int[3];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tipo: " + e.getClass().getSimpleName());
            System.out.println("Mensagem: " + e.getMessage());
            // e.printStackTrace(); // Imprime o stack trace completo (útil pra debug)
        }
    }
}
