public class Operadores {
    public static void main(String[] args) {
        // === ARITMÉTICOS: fazer contas ===
        int a = 10, b = 3;

        System.out.println("=== Aritméticos ===");
        System.out.println("a + b = " + (a + b));   // 13  (soma)
        System.out.println("a - b = " + (a - b));   // 7   (subtração)
        System.out.println("a * b = " + (a * b));   // 30  (multiplicação)
        System.out.println("a / b = " + (a / b));   // 3   (divisão inteira!)
        System.out.println("a % b = " + (a % b));   // 1   (resto da divisão)

        // Incremento e decremento
        int x = 5;
        x++;  // x = x + 1 → agora x é 6
        System.out.println("x++ → " + x);
        x--;  // x = x - 1 → volta pra 5
        System.out.println("x-- → " + x);

        // === ATRIBUIÇÃO: atalhos pra alterar variáveis ===
        System.out.println("\n=== Atribuição ===");
        int n = 10;
        n += 5;  // n = n + 5 → 15
        System.out.println("n += 5 → " + n);
        n -= 3;  // n = n - 3 → 12
        System.out.println("n -= 3 → " + n);
        n *= 2;  // n = n * 2 → 24
        System.out.println("n *= 2 → " + n);
        n /= 4;  // n = n / 4 → 6
        System.out.println("n /= 4 → " + n);
        n %= 4;  // n = n % 4 → 2
        System.out.println("n %%= 4 → " + n);

        // === COMPARAÇÃO: comparam valores, retornam boolean ===
        System.out.println("\n=== Comparação ===");
        int p = 10, q = 20;
        System.out.println("p == q → " + (p == q));   // false (igual?)
        System.out.println("p != q → " + (p != q));   // true  (diferente?)
        System.out.println("p > q  → " + (p > q));    // false (maior?)
        System.out.println("p < q  → " + (p < q));    // true  (menor?)
        System.out.println("p >= q → " + (p >= q));   // false (maior ou igual?)
        System.out.println("p <= q → " + (p <= q));   // true  (menor ou igual?)

        // === LÓGICOS: combinam condições booleanas ===
        System.out.println("\n=== Lógicos ===");
        boolean sol = true, calor = false;
        System.out.println("sol && calor → " + (sol && calor));   // false (AND: ambos true?)
        System.out.println("sol || calor → " + (sol || calor));   // true  (OR: pelo menos um?)
        System.out.println("!sol         → " + (!sol));           // false (NOT: inverte)
    }
}
