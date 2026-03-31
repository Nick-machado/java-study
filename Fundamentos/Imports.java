// Importando classes específicas
import java.util.Scanner;
import java.util.Arrays;
import java.time.LocalDate;

// Importando um pacote inteiro com o wildcard *
// import java.util.*;

public class Imports {
    public static void main(String[] args) {

        // Usando Scanner (de java.util)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scanner importado com sucesso: " + scanner);
        scanner.close();

        // Usando Arrays (de java.util)
        int[] numeros = {3, 1, 4, 1, 5};
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        // Usando LocalDate (de java.time)
        LocalDate hoje = LocalDate.now();
        System.out.println("Data de hoje: " + hoje);

        // Usando classes do java.lang (não precisa importar!)
        String texto = "Não precisei importar String";
        int numero = Integer.parseInt("42");
        double raiz = Math.sqrt(64);
        System.out.println(texto);
        System.out.println("parseInt: " + numero);
        System.out.println("Math.sqrt: " + raiz);
    }
}
