import java.util.Scanner;

public class Input_de_dados {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler do teclado
        Scanner scanner = new Scanner(System.in);

        // Lendo uma String
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");

        // Lendo um número inteiro
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Você tem " + idade + " anos.");

        // Lendo um número decimal (double)
        System.out.print("Digite sua altura (ex: 1.75): ");
        double altura = scanner.nextDouble();
        System.out.println("Sua altura é: " + altura + "m");

        // Lendo um boolean
        System.out.print("Você é estudante? (true/false): ");
        boolean estudante = scanner.nextBoolean();
        System.out.println("Estudante: " + estudante);

        // ===== CUIDADO COM O nextLine() DEPOIS DE nextInt()/nextDouble() =====
        // O nextInt(), nextDouble(), etc. NÃO consomem o "\n" (enter) que o usuário digitou.
        // Então, se você chamar nextLine() logo depois, ele vai ler essa quebra de linha vazia.
        // Solução: colocar um scanner.nextLine() extra pra "limpar" o buffer.

        scanner.nextLine(); // Limpa o buffer do \n pendente

        System.out.print("Digite sua cidade: ");
        String cidade = scanner.nextLine();
        System.out.println("Cidade: " + cidade);

        // Fechando o Scanner (boa prática)
        scanner.close();
    }
}
