public class Variaveis {
    public static void main(String[] args) {
        // Em Java, toda variável precisa ter um TIPO declarado.
        // Sintaxe: tipo nomeDaVariavel = valor;

        // String: armazena texto (sempre entre aspas duplas)
        String nome = "Nicolau";

        // int: armazena números inteiros
        int idade = 22;

        // double: armazena números decimais (ponto flutuante)
        double altura = 1.75;

        // char: armazena UM único caractere (sempre entre aspas simples)
        char inicial = 'N';

        // boolean: armazena verdadeiro ou falso
        boolean estudante = true;

        System.out.println("=== Variáveis básicas ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Estudante: " + estudante);

        // Variáveis podem ser reatribuídas (mudar de valor)
        idade = 23;
        System.out.println("\nIdade atualizada: " + idade);

        // Declarar sem inicializar e atribuir depois
        String cidade;
        cidade = "São Paulo";
        System.out.println("Cidade: " + cidade);

        // Declarar múltiplas variáveis do mesmo tipo
        int x = 5, y = 10, z = 15;
        System.out.println("\nx = " + x + ", y = " + y + ", z = " + z);

        // final: constante, não pode ser alterada depois
        final double PI = 3.14159;
        System.out.println("PI: " + PI);
        // PI = 3.14; // ERRO! final não pode ser reatribuído
    }
}
