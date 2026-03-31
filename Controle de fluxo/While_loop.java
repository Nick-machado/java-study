public class While_loop {
    public static void main(String[] args) {
        // While: repete enquanto a condição for true.
        // Cuidado: se a condição nunca virar false, loop infinito!

        // === WHILE básico ===
        System.out.println("=== While básico ===");
        int i = 1;
        while (i <= 5) {
            System.out.println("Contando: " + i);
            i++; // Sem isso → loop infinito!
        }

        // === DO-WHILE: executa pelo menos UMA vez ===
        // A diferença é que a condição é verificada DEPOIS da primeira execução
        System.out.println("\n=== Do-While ===");
        int numero = 10;
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero <= 12);

        // Mesmo se a condição for false desde o início, executa 1 vez:
        System.out.println("\n=== Do-While (condição false) ===");
        int x = 100;
        do {
            System.out.println("Executou pelo menos uma vez! x = " + x);
        } while (x < 5); // false desde o início, mas rodou 1 vez

        // === Exemplo prático: somar até chegar em 100 ===
        System.out.println("\n=== Soma até 100 ===");
        int soma = 0;
        int contador = 1;
        while (soma + contador <= 100) {
            soma += contador;
            contador++;
        }
        System.out.println("Somou de 1 até " + (contador - 1) + " = " + soma);

        // === While com String ===
        System.out.println("\n=== Contagem regressiva ===");
        int foguete = 5;
        while (foguete > 0) {
            System.out.println(foguete + "...");
            foguete--;
        }
        System.out.println("Lançamento!");
    }
}
