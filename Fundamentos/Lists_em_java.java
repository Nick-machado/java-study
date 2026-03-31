import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists_em_java {
    public static void main(String[] args) {
        // List: estrutura de dados DINÂMICA que armazena elementos em ordem.
        // Diferente de arrays, Lists podem crescer e diminuir de tamanho.
        // A implementação mais comum é o ArrayList.

        // === CRIANDO LISTS ===
        System.out.println("=== Criando Lists ===");

        // Jeito 1: ArrayList (mais comum)
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        System.out.println("Frutas: " + frutas); // [Maçã, Banana, Laranja]

        // Jeito 2: usando a interface List (boa prática)
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        System.out.println("Números: " + numeros); // [10, 20, 30]

        // === ACESSANDO ELEMENTOS ===
        System.out.println("\n=== Acessando Elementos ===");
        System.out.println("Primeira fruta: " + frutas.get(0));  // Maçã
        System.out.println("Última fruta: " + frutas.get(frutas.size() - 1)); // Laranja

        // === TAMANHO DA LIST ===
        System.out.println("Tamanho: " + frutas.size()); // 3

        // === MODIFICANDO ELEMENTOS ===
        System.out.println("\n=== Modificando Elementos ===");
        frutas.set(0, "Manga"); // Troca Maçã por Manga
        System.out.println("Após set(0): " + frutas); // [Manga, Banana, Laranja]

        // === ADICIONANDO ELEMENTOS ===
        System.out.println("\n=== Adicionando Elementos ===");
        frutas.add("Uva");           // Adiciona no final
        frutas.add(1, "Morango");     // Adiciona na posição 1 (empurra os outros)
        System.out.println("Após adds: " + frutas); // [Manga, Morango, Banana, Laranja, Uva]

        // === REMOVENDO ELEMENTOS ===
        System.out.println("\n=== Removendo Elementos ===");
        frutas.remove("Banana");     // Remove pelo valor
        frutas.remove(0);            // Remove pelo índice
        System.out.println("Após removes: " + frutas); // [Morango, Laranja, Uva]

        // === VERIFICAÇÕES ===
        System.out.println("\n=== Verificações ===");
        System.out.println("Contém Morango? " + frutas.contains("Morango"));   // true
        System.out.println("Contém Banana? " + frutas.contains("Banana"));     // false
        System.out.println("Está vazia? " + frutas.isEmpty());                 // false
        System.out.println("Índice de Uva: " + frutas.indexOf("Uva"));        // 2

        // === PERCORRENDO COM FOR ===
        System.out.println("\n=== For normal ===");
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("Posição " + i + ": " + frutas.get(i));
        }

        // === PERCORRENDO COM FOR-EACH ===
        System.out.println("\n=== For-Each ===");
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        // === MÉTODOS ÚTEIS ===
        System.out.println("\n=== Métodos úteis ===");

        // Ordenar
        List<Integer> desordenados = new ArrayList<>();
        desordenados.add(5);
        desordenados.add(2);
        desordenados.add(8);
        desordenados.add(1);
        desordenados.add(9);
        desordenados.add(3);
        System.out.println("Antes: " + desordenados);        // [5, 2, 8, 1, 9, 3]
        Collections.sort(desordenados);
        System.out.println("Ordenado: " + desordenados);     // [1, 2, 3, 5, 8, 9]

        // Inverter
        Collections.reverse(desordenados);
        System.out.println("Invertido: " + desordenados);    // [9, 8, 5, 3, 2, 1]

        // Menor e Maior
        System.out.println("Menor: " + Collections.min(desordenados)); // 1
        System.out.println("Maior: " + Collections.max(desordenados)); // 9

        // Limpar tudo
        desordenados.clear();
        System.out.println("Após clear: " + desordenados);   // []
        System.out.println("Vazia? " + desordenados.isEmpty()); // true

        // === DIFERENÇA ENTRE ARRAY E LIST ===
        System.out.println("\n=== Array vs List ===");
        // Array: tamanho FIXO, definido na criação
        String[] arrayFixo = new String[3]; // Sempre terá 3 posições
        // List: tamanho DINÂMICO, cresce e diminui conforme necessário
        List<String> listaDinamica = new ArrayList<>(); // Começa vazia, cresce sozinha

        // === WRAPPER CLASSES ===
        // Lists não aceitam tipos primitivos (int, double, etc.)
        // Usamos as Wrapper Classes correspondentes:
        // int → Integer, double → Double, boolean → Boolean, char → Character
        List<Integer> inteiros = new ArrayList<>();    // Integer, não int
        List<Double> decimais = new ArrayList<>();     // Double, não double
        List<Boolean> flags = new ArrayList<>();       // Boolean, não boolean

        inteiros.add(42);     // Autoboxing: int → Integer automaticamente
        int valor = inteiros.get(0); // Unboxing: Integer → int automaticamente
        System.out.println("Valor com autoboxing/unboxing: " + valor); // 42
    }
}
