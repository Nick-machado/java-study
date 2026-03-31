public class Strings_em_java {
    public static void main(String[] args) {
        String saudacao = "Olá, Mundo!";

        // === TAMANHO ===
        System.out.println("=== Métodos de String ===");
        System.out.println("Texto: " + saudacao);
        System.out.println("Tamanho: " + saudacao.length()); // 11

        // === MAIÚSCULA / MINÚSCULA ===
        System.out.println("Maiúscula: " + saudacao.toUpperCase()); // OLÁ, MUNDO!
        System.out.println("Minúscula: " + saudacao.toLowerCase()); // olá, mundo!

        // === BUSCAR ===
        System.out.println("\n=== Buscar ===");
        System.out.println("indexOf('Mundo'): " + saudacao.indexOf("Mundo")); // 5
        System.out.println("contains('Olá'): " + saudacao.contains("Olá"));   // true
        System.out.println("startsWith('Olá'): " + saudacao.startsWith("Olá")); // true
        System.out.println("endsWith('!'): " + saudacao.endsWith("!"));          // true

        // === EXTRAIR / MODIFICAR ===
        System.out.println("\n=== Extrair ===");
        System.out.println("charAt(0): " + saudacao.charAt(0));         // O
        System.out.println("substring(5): " + saudacao.substring(5));    // Mundo!
        System.out.println("substring(5,10): " + saudacao.substring(5, 10)); // Mundo

        // === SUBSTITUIR ===
        System.out.println("\n=== Substituir ===");
        System.out.println("replace: " + saudacao.replace("Mundo", "Java")); // Olá, Java!

        // === ESPAÇOS ===
        String comEspacos = "  Java é legal  ";
        System.out.println("\n=== Espaços ===");
        System.out.println("Antes: '" + comEspacos + "'");
        System.out.println("trim(): '" + comEspacos.trim() + "'"); // Remove espaços das pontas

        // === SPLIT: quebrar string em array ===
        System.out.println("\n=== Split ===");
        String frutas = "maçã,banana,laranja";
        String[] lista = frutas.split(",");
        for (String fruta : lista) {
            System.out.println("- " + fruta);
        }

        // === CONCATENAÇÃO ===
        System.out.println("\n=== Concatenação ===");
        String nome = "Nicolau";
        int idade = 22;
        // Jeito 1: com +
        System.out.println(nome + " tem " + idade + " anos");
        // Jeito 2: concat()
        System.out.println(nome.concat(" é estudante"));

        // === COMPARAÇÃO DE STRINGS ===
        System.out.println("\n=== Comparação ===");
        String a = "Java";
        String b = "java";
        System.out.println("equals: " + a.equals(b));             // false (case sensitive)
        System.out.println("equalsIgnoreCase: " + a.equalsIgnoreCase(b)); // true

        // === STRINGS SÃO IMUTÁVEIS ===
        // Métodos como toUpperCase() NÃO alteram a string original.
        // Eles retornam uma NOVA string.
        String original = "hello";
        original.toUpperCase(); // Não faz nada se não guardar!
        System.out.println("\nOriginal intacto: " + original); // hello
        String modificado = original.toUpperCase();
        System.out.println("Novo: " + modificado); // HELLO
    }
}
