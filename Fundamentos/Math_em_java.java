public class Math_em_java {
    public static void main(String[] args) {
        // A classe Math já vem pronta no Java — não precisa importar nada.
        // Todos os métodos são static, então chama direto: Math.metodo()

        // === BÁSICOS ===
        System.out.println("=== Básicos ===");
        System.out.println("Math.max(10, 20): " + Math.max(10, 20));   // 20 (maior)
        System.out.println("Math.min(10, 20): " + Math.min(10, 20));   // 10 (menor)
        System.out.println("Math.abs(-15): " + Math.abs(-15));          // 15 (valor absoluto)

        // === ARREDONDAMENTO ===
        System.out.println("\n=== Arredondamento ===");
        System.out.println("Math.round(4.7): " + Math.round(4.7));     // 5 (arredonda)
        System.out.println("Math.round(4.3): " + Math.round(4.3));     // 4
        System.out.println("Math.ceil(4.1): " + Math.ceil(4.1));       // 5.0 (arredonda pra cima)
        System.out.println("Math.floor(4.9): " + Math.floor(4.9));     // 4.0 (arredonda pra baixo)

        // === POTÊNCIA E RAIZ ===
        System.out.println("\n=== Potência e Raiz ===");
        System.out.println("Math.pow(2, 3): " + Math.pow(2, 3));       // 8.0 (2³)
        System.out.println("Math.sqrt(64): " + Math.sqrt(64));          // 8.0 (raiz quadrada)

        // === CONSTANTES ===
        System.out.println("\n=== Constantes ===");
        System.out.println("Math.PI: " + Math.PI);       // 3.141592653589793
        System.out.println("Math.E: " + Math.E);         // 2.718281828459045

        // === RANDOM ===
        System.out.println("\n=== Random ===");
        // Math.random() retorna um double entre 0.0 (inclusive) e 1.0 (exclusive)
        System.out.println("Random [0,1): " + Math.random());

        // Pra gerar um número inteiro entre 0 e 100:
        int aleatorio = (int)(Math.random() * 101);
        System.out.println("Random [0,100]: " + aleatorio);

        // Pra gerar entre um intervalo (ex: 1 a 10):
        int min = 1, max = 10;
        int entre = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println("Random [1,10]: " + entre);
    }
}
