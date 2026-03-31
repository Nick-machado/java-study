public class Tipos_de_dados {
    public static void main(String[] args) {
        // Java tem dois grupos de tipos de dados:
        // 1) PRIMITIVOS: armazenam valores simples direto na memória
        // 2) REFERÊNCIA: armazenam endereços de objetos (ex: String, Arrays)

        // === TIPOS PRIMITIVOS (8 no total) ===

        // -- Números inteiros --
        byte meuByte = 127;           // 1 byte  | -128 a 127
        short meuShort = 32000;       // 2 bytes | -32.768 a 32.767
        int meuInt = 2000000000;      // 4 bytes | -2 bi a 2 bi (mais usado)
        long meuLong = 9000000000L;   // 8 bytes | número gigante (precisa do L no final)

        // -- Números decimais --
        float meuFloat = 3.14f;       // 4 bytes | até 7 dígitos (precisa do f no final)
        double meuDouble = 3.14159;   // 8 bytes | até 15 dígitos (mais usado)

        // -- Outros --
        char meuChar = 'A';           // 2 bytes | um único caractere Unicode
        boolean meuBool = true;       // 1 bit   | true ou false

        System.out.println("=== Tipos Primitivos ===");
        System.out.println("byte: " + meuByte);
        System.out.println("short: " + meuShort);
        System.out.println("int: " + meuInt);
        System.out.println("long: " + meuLong);
        System.out.println("float: " + meuFloat);
        System.out.println("double: " + meuDouble);
        System.out.println("char: " + meuChar);
        System.out.println("boolean: " + meuBool);

        // === TIPO REFERÊNCIA ===
        // String não é primitivo! É um objeto.
        String meuTexto = "Isso é uma String";
        System.out.println("\nString: " + meuTexto);

        // === CASTING (conversão de tipos) ===
        System.out.println("\n=== Casting ===");

        // Widening (automático): tipo menor → tipo maior
        // byte → short → int → long → float → double
        int numInteiro = 100;
        double numDecimal = numInteiro; // int vira double automaticamente
        System.out.println("int → double: " + numDecimal); // 100.0

        // Narrowing (manual): tipo maior → tipo menor
        // Precisa do (tipo) na frente, senão dá erro
        double preco = 9.99;
        int precoInteiro = (int) preco; // Perde a parte decimal!
        System.out.println("double → int: " + precoInteiro); // 9

        // char também pode virar int (código ASCII/Unicode)
        char letra = 'A';
        int codigoAscii = letra;
        System.out.println("char 'A' → int: " + codigoAscii); // 65
    }
}
