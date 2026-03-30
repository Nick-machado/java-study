// Abstração = esconder a complexidade e mostrar só o essencial.
// Em Java, usamos classes abstratas e interfaces pra isso.

// Classe abstrata: não pode ser instanciada diretamente (não dá pra fazer "new Forma()").
// Serve como um molde que OBRIGA as subclasses a implementar certos métodos.
abstract class Forma {
    String cor;

    Forma(String cor) {
        this.cor = cor;
    }

    // Método abstrato: só tem a assinatura, sem corpo.
    // Quem herdar Forma TEM QUE implementar esse método.
    abstract double calcularArea();

    // Método concreto: classes abstratas também podem ter métodos normais.
    void exibir() {
        System.out.println("Cor: " + cor + " | Área: " + calcularArea());
    }
}

// Subclasse concreta: é obrigada a implementar calcularArea()
class Circulo extends Forma {
    double raio;

    Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Retangulo extends Forma {
    double largura;
    double altura;

    Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return largura * altura;
    }
}

// Interface: é como um "contrato" que a classe se compromete a cumprir.
// Todos os métodos de uma interface são abstratos por padrão.
// Uma classe pode implementar MÚLTIPLAS interfaces (diferente de herança, que é só uma).
interface Desenhavel {
    void desenhar(); // Quem implementar Desenhavel TEM QUE ter esse método
}

interface Redimensionavel {
    void redimensionar(double fator);
}

// Uma classe pode estender UMA classe e implementar VÁRIAS interfaces ao mesmo tempo
class Quadrado extends Forma implements Desenhavel, Redimensionavel {
    double lado;

    Quadrado(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um quadrado de lado " + lado);
    }

    @Override
    public void redimensionar(double fator) {
        lado *= fator;
        System.out.println("Quadrado redimensionado! Novo lado: " + lado);
    }
}

public class Abstracao {
    public static void main(String[] args) {
        // Forma forma = new Forma("Azul"); // ERRO! Não pode instanciar classe abstrata

        Circulo circulo = new Circulo("Vermelho", 5.0);
        Retangulo retangulo = new Retangulo("Azul", 4.0, 6.0);
        Quadrado quadrado = new Quadrado("Verde", 3.0);

        System.out.println("=== Formas (Abstração) ===");
        circulo.exibir();
        retangulo.exibir();
        quadrado.exibir();

        System.out.println("\n=== Interface em ação ===");
        quadrado.desenhar();
        quadrado.redimensionar(2.0);
        quadrado.exibir(); // Área atualizada após redimensionar
    }
}
