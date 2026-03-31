import java.util.Arrays;

public class Arrays_em_java {
    public static void main(String[] args) {
        // Array: estrutura que armazena MÚLTIPLOS valores do MESMO tipo
        // em posições numeradas (índices começam em 0).

        // === CRIANDO ARRAYS ===
        System.out.println("=== Criando Arrays ===");

        // Jeito 1: declarar com valores
        String[] carros = {"Fusca", "Civic", "Corolla", "Gol"};

        // Jeito 2: declarar tamanho e preencher depois
        int[] notas = new int[4]; // Array de 4 posições (todas começam em 0)
        notas[0] = 85;
        notas[1] = 92;
        notas[2] = 78;
        notas[3] = 95;

        // === ACESSANDO ELEMENTOS ===
        System.out.println("Primeiro carro: " + carros[0]);  // Fusca
        System.out.println("Último carro: " + carros[3]);    // Gol
        System.out.println("Nota 2: " + notas[1]);           // 92

        // === TAMANHO DO ARRAY ===
        System.out.println("\nTamanho: " + carros.length); // 4

        // === MODIFICANDO ELEMENTOS ===
        carros[0] = "Kombi"; // Trocou Fusca por Kombi
        System.out.println("Carro 0 agora: " + carros[0]); // Kombi

        // === PERCORRENDO COM FOR ===
        System.out.println("\n=== For normal ===");
        for (int i = 0; i < carros.length; i++) {
            System.out.println("Posição " + i + ": " + carros[i]);
        }

        // === PERCORRENDO COM FOR-EACH ===
        System.out.println("\n=== For-Each ===");
        for (String carro : carros) {
            System.out.println("Carro: " + carro);
        }

        // === ARRAY MULTIDIMENSIONAL (matriz) ===
        System.out.println("\n=== Matriz 2D ===");
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // === MÉTODOS ÚTEIS (java.util.Arrays) ===
        System.out.println("\n=== Métodos úteis ===");
        int[] numeros = {5, 2, 8, 1, 9, 3};

        // Ordenar
        Arrays.sort(numeros);
        System.out.println("Ordenado: " + Arrays.toString(numeros)); // [1, 2, 3, 5, 8, 9]

        // Buscar (precisa estar ordenado antes!)
        int indice = Arrays.binarySearch(numeros, 5);
        System.out.println("Índice do 5: " + indice);

        // Preencher
        int[] zeros = new int[5];
        Arrays.fill(zeros, 7);
        System.out.println("Preenchido: " + Arrays.toString(zeros)); // [7, 7, 7, 7, 7]

        // Comparar
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println("Arrays iguais: " + Arrays.equals(a, b)); // true
    }
}
