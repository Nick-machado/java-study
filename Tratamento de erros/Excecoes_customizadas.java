// Exceção customizada: você cria suas próprias exceções!
// Basta criar uma classe que extends Exception (checked) ou RuntimeException (unchecked).

// === EXCEÇÃO CUSTOMIZADA CHECKED ===
// Quem chamar é OBRIGADO a tratar com try-catch ou declarar throws
class SaldoInsuficienteException extends Exception {
    private double saldoAtual;
    private double valorSolicitado;

    SaldoInsuficienteException(double saldoAtual, double valorSolicitado) {
        super("Saldo insuficiente! Saldo: R$" + saldoAtual + " | Solicitado: R$" + valorSolicitado);
        this.saldoAtual = saldoAtual;
        this.valorSolicitado = valorSolicitado;
    }

    double getSaldoAtual() { return saldoAtual; }
    double getValorSolicitado() { return valorSolicitado; }
}

// === EXCEÇÃO CUSTOMIZADA UNCHECKED ===
// NÃO obriga quem chama a tratar (mas é boa prática tratar)
class IdadeInvalidaException extends RuntimeException {
    IdadeInvalidaException(int idade) {
        super("Idade inválida: " + idade + ". Deve ser entre 0 e 150.");
    }
}

// === CLASSE QUE USA AS EXCEÇÕES ===
class ContaBancaria {
    private String titular;
    private double saldo;

    ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // throws SaldoInsuficienteException: avisa que pode lançar
    void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo!");
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException(saldo, valor);
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado. Saldo: R$" + saldo);
    }

    void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo!");
        }
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo: R$" + saldo);
    }

    double getSaldo() { return saldo; }
    String getTitular() { return titular; }
}

public class Excecoes_customizadas {
    // Método que usa exceção unchecked customizada
    static void cadastrarPessoa(String nome, int idade) {
        if (idade < 0 || idade > 150) {
            throw new IdadeInvalidaException(idade);
        }
        System.out.println("Cadastro: " + nome + ", " + idade + " anos");
    }

    public static void main(String[] args) {
        // === TESTANDO EXCEÇÃO CHECKED (SaldoInsuficienteException) ===
        System.out.println("=== Exceção Checked Customizada ===");
        ContaBancaria conta = new ContaBancaria("Nicolau", 1000);

        try {
            conta.sacar(500);   // OK
            conta.sacar(800);   // Vai lançar SaldoInsuficienteException
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Faltam: R$" + (e.getValorSolicitado() - e.getSaldoAtual()));
        }

        // === TESTANDO EXCEÇÃO UNCHECKED (IdadeInvalidaException) ===
        System.out.println("\n=== Exceção Unchecked Customizada ===");

        cadastrarPessoa("João", 25);   // OK

        try {
            cadastrarPessoa("Maria", -5); // Vai lançar IdadeInvalidaException
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // === TESTANDO IllegalArgumentException ===
        System.out.println("\n=== IllegalArgumentException ===");
        try {
            conta.depositar(-100); // Valor negativo
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // === RESUMO ===
        System.out.println("\n=== Quando criar exceções customizadas? ===");
        System.out.println("- Quando os erros padrão do Java não expressam bem o problema");
        System.out.println("- Quando você quer carregar informações extras no erro");
        System.out.println("- extends Exception     → Checked (obriga tratar)");
        System.out.println("- extends RuntimeException → Unchecked (não obriga)");
    }
}
