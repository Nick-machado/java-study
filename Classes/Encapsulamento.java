public class Encapsulamento {
    // Encapsulamento = esconder os dados internos e controlar o acesso a eles.
    // A ideia é: atributos PRIVATE + métodos GET/SET PUBLIC.
    // Assim, ninguém de fora mexe nos dados diretamente, e você pode validar tudo.

    private String nome;
    private int idade;
    private double salario;

    // Construtor
    Encapsulamento(String nome, int idade, double salario) {
        this.nome = nome;
        setIdade(idade);      // Usa o setter para validar já na criação
        setSalario(salario);
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para idade
    public int getIdade() {
        return idade;
    }

    // Setter para idade COM validação
    public void setIdade(int idade) {
        if (idade > 0 && idade < 150) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida: " + idade);
        }
    }

    // Getter para salário
    public double getSalario() {
        return salario;
    }

    // Setter para salário COM validação
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário não pode ser negativo!");
        }
    }

    public static void main(String[] args) {
        Encapsulamento funcionario = new Encapsulamento("Nicolau", 22, 5000.00);

        // Acessando via getters
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Salário: R$" + funcionario.getSalario());

        // Modificando via setters (com validação embutida)
        funcionario.setNome("Nicolas");
        funcionario.setIdade(23);
        funcionario.setSalario(6000.00);

        System.out.println("\n=== Após atualização ===");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Salário: R$" + funcionario.getSalario());

        // Tentando valores inválidos (os setters protegem)
        System.out.println("\n=== Testando validação ===");
        funcionario.setIdade(-5);       // Vai imprimir "Idade inválida"
        funcionario.setSalario(-1000);  // Vai imprimir "Salário não pode ser negativo"

        // Os valores não mudaram por causa da validação
        System.out.println("Idade continua: " + funcionario.getIdade());
        System.out.println("Salário continua: R$" + funcionario.getSalario());
    }
}
