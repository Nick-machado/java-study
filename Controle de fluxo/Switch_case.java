public class Switch_case {
    public static void main(String[] args) {
        // Switch: alternativa ao if-else quando você compara UMA variável
        // contra vários valores possíveis. Mais limpo e legível.

        // === SWITCH com int ===
        System.out.println("=== Switch com int ===");
        int diaSemana = 3;

        switch (diaSemana) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default: // Quando nenhum case bate
                System.out.println("Dia inválido");
                break;
        }

        // === SWITCH com String ===
        System.out.println("\n=== Switch com String ===");
        String fruta = "banana";

        switch (fruta) {
            case "maçã":
                System.out.println("Maçã custa R$5");
                break;
            case "banana":
                System.out.println("Banana custa R$3");
                break;
            case "laranja":
                System.out.println("Laranja custa R$4");
                break;
            default:
                System.out.println("Fruta não encontrada");
                break;
        }

        // === SEM BREAK: "fall-through" ===
        // Se esquecer o break, o código continua executando os cases seguintes!
        System.out.println("\n=== Sem break (fall-through) ===");
        int mes = 3;

        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Verão");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Outono");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Inverno");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Primavera");
                break;
        }
    }
}
