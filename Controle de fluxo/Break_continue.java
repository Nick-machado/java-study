public class Break_continue {
    public static void main(String[] args) {
        // Break: PARA o loop inteiro e sai dele.
        // Continue: PULA a iteração atual e vai pra próxima.

        // === BREAK ===
        System.out.println("=== Break ===");
        // Procurando o número 5 e parando quando encontrar
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Encontrei o 5! Parando o loop.");
                break; // Sai do loop completamente
            }
            System.out.println("Número: " + i);
        }
        // Saída: 1, 2, 3, 4, "Encontrei o 5!"

        // === CONTINUE ===
        System.out.println("\n=== Continue ===");
        // Imprimindo só os números ÍMPARES (pulando os pares)
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Pula pra próxima iteração
            }
            System.out.println("Ímpar: " + i);
        }
        // Saída: 1, 3, 5, 7, 9

        // === BREAK no WHILE ===
        System.out.println("\n=== Break no While ===");
        int soma = 0;
        int num = 1;
        while (true) { // Loop "infinito" controlado pelo break
            soma += num;
            if (soma > 20) {
                System.out.println("Soma passou de 20! Soma = " + soma);
                break;
            }
            num++;
        }

        // === CONTINUE no WHILE ===
        System.out.println("\n=== Continue no While ===");
        int j = 0;
        while (j < 10) {
            j++;
            if (j == 3 || j == 7) {
                System.out.println("Pulando " + j);
                continue;
            }
            System.out.println("Valor: " + j);
        }

        // === BREAK em loop aninhado (só sai do loop interno) ===
        System.out.println("\n=== Break em loop aninhado ===");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop externo: " + i);
            for (int k = 1; k <= 5; k++) {
                if (k == 3) {
                    break; // Sai só do loop interno
                }
                System.out.println("  Loop interno: " + k);
            }
        }
    }
}
