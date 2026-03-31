public class If_else {
    public static void main(String[] args) {
        int hora = 14;

        // === IF simples ===
        System.out.println("=== If simples ===");
        if (hora < 12) {
            System.out.println("Bom dia!");
        }

        // === IF-ELSE ===
        System.out.println("\n=== If-Else ===");
        int idade = 17;
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // === IF - ELSE IF - ELSE (encadeado) ===
        System.out.println("\n=== Else If ===");
        int nota = 75;
        if (nota >= 90) {
            System.out.println("Conceito A");
        } else if (nota >= 80) {
            System.out.println("Conceito B");
        } else if (nota >= 70) {
            System.out.println("Conceito C");
        } else if (nota >= 60) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Reprovado");
        }

        // === OPERADOR TERNÁRIO: if-else em uma linha ===
        System.out.println("\n=== Ternário ===");
        int temp = 30;
        // condição ? valorSeTrue : valorSeFalse
        String clima = (temp > 25) ? "Está quente" : "Está frio";
        System.out.println(clima);

        // === IF aninhado (if dentro de if) ===
        System.out.println("\n=== If aninhado ===");
        boolean temCarteira = true;
        int idadeMotorista = 20;

        if (idadeMotorista >= 18) {
            if (temCarteira) {
                System.out.println("Pode dirigir!");
            } else {
                System.out.println("Precisa tirar a carteira.");
            }
        } else {
            System.out.println("Muito jovem pra dirigir.");
        }
    }
}
