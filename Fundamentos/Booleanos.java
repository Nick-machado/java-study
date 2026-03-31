public class Booleanos {
    public static void main(String[] args) {
        // Boolean: só tem dois valores possíveis — true ou false
        boolean javaEhLegal = true;
        boolean pythonEhIgual = false;

        System.out.println("=== Valores booleanos ===");
        System.out.println("Java é legal: " + javaEhLegal);       // true
        System.out.println("Python é igual: " + pythonEhIgual);   // false

        // === EXPRESSÕES BOOLEANAS ===
        // Qualquer comparação retorna um boolean
        System.out.println("\n=== Expressões ===");
        int idade = 22;
        System.out.println("idade > 18: " + (idade > 18));     // true
        System.out.println("idade == 30: " + (idade == 30));   // false
        System.out.println("idade != 22: " + (idade != 22));   // false

        // === OPERADORES LÓGICOS COM BOOLEANOS ===
        System.out.println("\n=== Operadores Lógicos ===");
        boolean temCarteira = true;
        boolean temCarro = false;

        // AND (&&): ambos precisam ser true
        System.out.println("temCarteira && temCarro: " + (temCarteira && temCarro)); // false

        // OR (||): pelo menos um precisa ser true
        System.out.println("temCarteira || temCarro: " + (temCarteira || temCarro)); // true

        // NOT (!): inverte o valor
        System.out.println("!temCarro: " + (!temCarro)); // true

        // === USO REAL: condições ===
        System.out.println("\n=== Uso em condições ===");
        boolean maiorDeIdade = idade >= 18;

        if (maiorDeIdade) {
            System.out.println("Pode entrar!");
        } else {
            System.out.println("Acesso negado.");
        }

        // Combinando condições
        boolean temIngresso = true;
        if (maiorDeIdade && temIngresso) {
            System.out.println("Bem-vindo ao show!");
        }
    }
}
