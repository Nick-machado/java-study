public class For_loop {
    public static void main(String[] args) {
        // For: quando você SABE quantas vezes quer repetir.
        // Sintaxe: for (início; condição; incremento) { }

        // === FOR básico ===
        System.out.println("=== For básico ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Volta " + i);
        }

        // === Contagem regressiva ===
        System.out.println("\n=== Regressiva ===");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\nLançamento!");

        // === Pulando de 2 em 2 ===
        System.out.println("\n=== De 2 em 2 ===");
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // === FOR-EACH: percorrer arrays/coleções ===
        // Mais limpo quando você não precisa do índice
        System.out.println("\n=== For-Each ===");
        String[] frutas = {"Maçã", "Banana", "Laranja", "Manga"};
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        // === FOR aninhado (loop dentro de loop) ===
        System.out.println("\n=== For aninhado (tabuada do 3) ===");
        int numero = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // === Padrão com loops aninhados ===
        System.out.println("\n=== Triângulo de * ===");
        for (int linha = 1; linha <= 5; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
