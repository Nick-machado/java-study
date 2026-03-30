# NOTAS DO NICOLAU

Este arquivo é um registro de notas e informações legais do Nicolau em cima dos estudos dele em Java. Aqui eu vou listar conceitos, dicas, e tudo mais que eu achar relevante para o meu aprendizado e pra quem olhar. É a minha primeira experiência com Java, então tudo que eu aprender vai estar aqui, cru e sem censura.

Detalhe, tudo oq eu to vendo é em Java 26, a versão mais recente até o momento. 27/03/2026

Eu estou usando para aprender os recursos de Java da w3schools e o roadmap de Java proposto pela roadmap.sh. Eu vou seguir os tópicos e anotar tudo que eu achar importante, desde sintaxe básica até conceitos mais avançados

w3schools: https://www.w3schools.com/java/default.asp
roadmap.sh: https://roadmap.sh/java

---

## Sobre o Java e a minha primeira impressão

Vou atuaizando isso conforme eu vou estudando.

Eu trabalhei muito com python, e o Java é bem diferente. Ele é mais verboso, o que significa que eu preciso escrever mais código para fazer as mesmas coisas que eu fazia em Python. Mas isso também tem suas vantagens, como uma estrutura mais clara e uma melhor organização do código. Além disso, diferente do Python, o Java é uma linguagem compilada, o que pode resultar em um desempenho melhor em algumas situações.

---

## Ordem que eu escolhi estudar e vou escrever (baseado nas pastas que eu criei):

- Introdução
- Métodos e Funções
- Classes

---

## Introdução

### Pra rodar o Java

Vamos supor que você já tenha instalado o Java Development Kit (JDK) e configurado as variáveis de ambiente corretamente. E além disso, você e suas super habilidades de programação fizeram um hello world. Para compilar um arquivo Java, nesse caso, seu hello world, você pode usar o comando `javac` seguido do nome do arquivo. Por exemplo:

```bash
javac MeuPrograma.java
```

Isso vai gerar um arquivo `MeuPrograma.class`, que é o bytecode que a máquina virtual Java (JVM) pode executar. Para rodar o programa, você usa o comando `java` seguido do nome da classe (sem a extensão .class):

```bash
java MeuPrograma
```

E pronto, rodou seu Hello World

O que acabou de acontecer é que o comando `javac` compilou seu código Java em bytecode, que é um formato intermediário que a JVM pode entender. O comando `java` então executa esse bytecode na JVM, permitindo que seu programa seja executado em qualquer plataforma que tenha uma JVM instalada, o que é uma das grandes vantagens do Java: a portabilidade.

### Sintaxe básica

Vamos usar esse código de exemplo:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

A classe `Main` é a definição de uma classe em Java. Em Java, tudo precisa estar dentro de uma classe, mesmo o código que é executado. O nome da classe deve ser o mesmo do arquivo, ou seja, se a classe se chama `Main`, o arquivo deve ser `Main.java`. A palavra-chave `public` indica que a classe é pública e pode ser acessada por outras classes. A palavra-chave `class` é usada para definir uma nova classe.

Estou utilizando um método `main` que é o ponto de entrada do programa. Ele é obrigatório em qualquer aplicação Java, e é onde o programa começa a ser executado. O método `main` tem uma assinatura específica: ele deve ser `public`, `static`, e retornar `void`. Ele também aceita um array de strings como argumento, que pode ser usado para passar parâmetros para o programa. As {} conhecidas como chaves indicam o início e o fim de um bloco de código.

O `System.out.println` é um método que imprime uma linha de texto no console. Ele é parte da classe `System`, que é uma classe utilitária fornecida pelo Java para realizar operações de entrada e saída, entre outras coisas. O `out`, gíria para "output", é um objeto do tipo `PrintStream` que representa a saída padrão (normalmente o console), e o `println`, gíria para "print line", é um método desse objeto que imprime o texto seguido de uma nova linha. Ou seja, várias etapas para recriar a função print do Python, mas é assim que o Java funciona, ele é mais detalhado e explícito.


### Statements

Um programa de computador é simplesmente uma lista de "instruções" que são "executadas" pela máquina. Em linguagem de programação, essas "instruções" são chamadas de "statements". Um statement é uma linha de código que realiza uma ação específica. Por exemplo, em Java, a linha `System.out.println("Hello, World!");` é um statement que imprime "Hello, World!" no console.

Um detalhe importante, os statements em Java terminam com um ponto e vírgula (`;`). Isso é diferente de algumas outras linguagens, como Python, onde os statements não precisam de um terminador específico. O ponto e vírgula é usado para indicar o final de um statement, permitindo que o compilador saiba onde uma instrução termina e a próxima começa. Se você esquecer de colocar o ponto e vírgula no final de um statement, o compilador vai gerar um erro, porque ele não vai conseguir entender onde o statement termina.

Imagine que um statement como uma frase na linguagem humana. Mas ao invés de utilizar "." para terminar a frase, o Java utiliza ";". Então, cada vez que você escreve um statement, é como se estivesse escrevendo uma frase, e o ponto e vírgula é o sinal de pontuação que indica o fim dessa frase. Sem ele, o Java não consegue entender onde a frase termina, e isso causa um erro de sintaxe.

---

## Classes

Classes e objetos é o conceito fundamental da programação orientada a objetos (POO ou OOP), que é um paradigma de programação amplamente utilizado em Java. Uma classe é como um molde ou uma planta para criar objetos. Ela define as propriedades (variáveis) e comportamentos (métodos) que os objetos criados a partir dela terão.

Um jeito de se pensar é que uma classe é um template para criar objetos.

Vamos supor que eu tenha que projetar um sistema que coordena informações sobre carros. Como modelo, fabricante, kilometragem, etc. Para agilizar esse processo, eu posso criar uma classe `Carro` que define as propriedades e comportamentos comuns a todos os carros. Por exemplo:

```java
public class Carro {
    String modelo;
    String fabricante;
    int kilometragem;

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Kilometragem: " + kilometragem);
    }
}
```
No exemplo acima, a classe `Carro` tem três propriedades: `modelo`, `fabricante`, e `kilometragem`. Ela também tem um método chamado `exibirInformacoes()`, que imprime as informações do carro no console. Com essa classe, eu posso criar objetos específicos de carros, como um `Carro` chamado "Fusca" da fabricante "Volkswagen" com uma kilometragem de 100.000 km.

### Atributos

Atributos (ou variáveis de instância) são as propriedades que definem o estado de um objeto. Quando você cria uma classe, os atributos são as variáveis declaradas dentro dela. Cada objeto criado a partir da classe tem sua própria cópia dos atributos, ou seja, modificar o atributo de um objeto não afeta os outros.

Pra acessar ou modificar um atributo, você usa o operador ponto (`.`). Por exemplo: `carro1.modelo = "Fusca"` define o modelo do `carro1`, e `carro1.modelo` acessa esse valor. Simples assim.

O importante é entender que os objetos são independentes. Se eu mudar a kilometragem do `carro2`, a do `carro1` continua a mesma. Cada um vive na sua bolha.

```java
public class Atributos {
    String modelo;
    String fabricante;
    int kilometragem;

    public static void main(String[] args) {
        Atributos carro1 = new Atributos();
        carro1.modelo = "Fusca";
        carro1.fabricante = "Volkswagen";
        carro1.kilometragem = 100000;

        Atributos carro2 = new Atributos();
        carro2.modelo = "Civic";
        carro2.fabricante = "Honda";
        carro2.kilometragem = 50000;

        System.out.println("Modelo: " + carro1.modelo);  // Fusca
        System.out.println("Modelo: " + carro2.modelo);  // Civic

        // Modificando carro2 não afeta carro1
        carro2.kilometragem = 55000;
        System.out.println(carro1.kilometragem); // 100000 (intacto)
        System.out.println(carro2.kilometragem); // 55000
    }
}
```

### Construtores

O construtor é um método especial que é chamado automaticamente quando você cria um objeto com `new`. O nome do construtor deve ser **exatamente igual** ao nome da classe, e ele **não tem tipo de retorno** (nem `void`).

A grande vantagem do construtor é que ao invés de criar o objeto e depois definir cada atributo um por um, você já passa tudo de uma vez na hora de criar. Por exemplo:

```java
Construtores carro1 = new Construtores("Fusca", "Volkswagen", 100000);
```

Dentro do construtor, usamos a palavra-chave `this` para diferenciar o atributo da classe do parâmetro que estamos recebendo. O `this.modelo` se refere ao atributo do objeto, enquanto `modelo` (sem o `this`) se refere ao parâmetro do construtor.

```java
public class Construtores {
    String modelo;
    String fabricante;
    int kilometragem;

    // Construtor: mesmo nome da classe, sem tipo de retorno
    Construtores(String modelo, String fabricante, int kilometragem) {
        this.modelo = modelo;           // this.modelo = atributo do objeto
        this.fabricante = fabricante;   // modelo (sem this) = parâmetro recebido
        this.kilometragem = kilometragem;
    }

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Km: " + kilometragem);
    }

    public static void main(String[] args) {
        // Tudo de uma vez, sem precisar definir atributo por atributo
        Construtores carro1 = new Construtores("Fusca", "Volkswagen", 100000);
        Construtores carro2 = new Construtores("Civic", "Honda", 50000);

        carro1.exibirInformacoes();
        carro2.exibirInformacoes();
    }
}
```

### Modificadores de Acesso

Modificadores de acesso controlam quem pode ver e usar os atributos e métodos de uma classe. Os principais são:

- **`public`**: acessível de qualquer lugar, por qualquer classe.
- **`private`**: acessível **somente** dentro da própria classe. Ninguém de fora consegue acessar diretamente.
- **`protected`**: acessível dentro do mesmo pacote e por subclasses (via herança).
- **default** (sem modificador): acessível apenas dentro do mesmo pacote.

Além dos modificadores de acesso, existem outros modificadores importantes:

- **`static`**: o atributo/método pertence à classe, não ao objeto. Todos os objetos compartilham o mesmo valor. Você acessa direto pela classe: `MinhaClasse.meuAtributo`.
- **`final`**: o valor é constante e não pode ser alterado depois de definido. Tentou mudar? O compilador reclama.

Na prática, a regra é: atributos `private` + métodos `public` (getters/setters) para acessar. Isso é a base do encapsulamento.

```java
public class Modificadores_de_acesso {
    public String nome = "Nicolau";       // Qualquer classe acessa
    private int idade = 22;                // Só essa classe acessa
    protected String cidade = "São Paulo"; // Mesmo pacote + subclasses
    String pais = "Brasil";                // Mesmo pacote (default)

    static String especie = "Humano";      // Pertence à classe, não ao objeto
    final String tipo = "Estudante";       // Constante, não pode mudar

    // Getter: jeito público de acessar um atributo privado
    public int getIdade() {
        return idade;
    }

    public static void main(String[] args) {
        Modificadores_de_acesso pessoa = new Modificadores_de_acesso();

        System.out.println(pessoa.nome);       // OK, é public
        // System.out.println(pessoa.idade);    // ERRO! é private
        System.out.println(pessoa.getIdade());  // OK, acessa via getter

        System.out.println(Modificadores_de_acesso.especie); // static: acessa pela classe
        // pessoa.tipo = "Professor";           // ERRO! final não pode ser reatribuído
    }
}
```

### Encapsulamento

Encapsulamento é um dos pilares da programação orientada a objetos. A ideia é simples: **esconder os dados internos** da classe e **controlar o acesso** a eles através de métodos.

Na prática, isso significa:
- Atributos são `private` (ninguém mexe direto)
- Métodos `get` (getters) para **ler** os valores
- Métodos `set` (setters) para **alterar** os valores

A grande sacada é que nos setters você pode colocar **validações**. Por exemplo, impedir que alguém defina uma idade negativa ou um salário abaixo de zero. Em vez de confiar em quem usa a classe, você controla tudo dentro dela. É como ter uma porta com tranca: o dado está lá dentro, mas só entra quem segue as regras.

```java
public class Encapsulamento {
    private String nome;
    private int idade;

    Encapsulamento(String nome, int idade) {
        this.nome = nome;
        setIdade(idade); // Já valida na criação
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }

    // Setter com validação: impede valores absurdos
    public void setIdade(int idade) {
        if (idade > 0 && idade < 150) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida: " + idade);
        }
    }

    public static void main(String[] args) {
        Encapsulamento pessoa = new Encapsulamento("Nicolau", 22);

        System.out.println(pessoa.getNome());  // Nicolau
        System.out.println(pessoa.getIdade()); // 22

        pessoa.setIdade(-5);                   // "Idade inválida: -5"
        System.out.println(pessoa.getIdade()); // 22 (não mudou!)
    }
}
```

### Herança

Herança é o mecanismo que permite criar uma nova classe com base em uma classe existente, herdando todos os seus atributos e métodos. A classe que é herdada é chamada de **superclasse** (ou classe pai), e a nova classe é chamada de **subclasse** (ou classe filha).

A palavra-chave `extends` é usada para indicar a herança:

```java
class Carro extends Veiculo {
    // Carro herda tudo de Veiculo e pode adicionar coisas próprias
}
```

Dentro do construtor da subclasse, usamos `super()` para chamar o construtor da classe pai e inicializar os atributos herdados. A subclasse pode usar os métodos da classe pai diretamente, como se fossem dela.

A vantagem é evitar repetição de código. Se `Carro` e `Moto` têm atributos em comum (marca, ano), coloca tudo em `Veiculo` e ambos herdam. Aí cada um adiciona só o que é específico dele.

```java
class Veiculo {
    String marca;
    int ano;

    Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    void buzinar() {
        System.out.println("BEEP BEEP!");
    }
}

class Carro extends Veiculo {
    int portas;

    Carro(String marca, int ano, int portas) {
        super(marca, ano); // Chama o construtor da classe pai
        this.portas = portas;
    }
}

class Moto extends Veiculo {
    boolean temBau;

    Moto(String marca, int ano, boolean temBau) {
        super(marca, ano);
        this.temBau = temBau;
    }
}
```

**Detalhe importante:** em Java, uma classe só pode herdar de **uma** superclasse. Herança múltipla (herdar de duas classes ao mesmo tempo) não é permitida, mas isso se resolve com interfaces.

### Polimorfismo

Polimorfismo significa "muitas formas". É a capacidade de um mesmo método se comportar de maneiras diferentes dependendo de qual classe o implementa. Está diretamente ligado à herança.

Na prática: a classe pai define um método, e cada subclasse **sobrescreve** (`@Override`) esse método com sua própria versão. O Java sabe qual versão chamar com base no tipo real do objeto.

```java
Animal animal1 = new Cachorro("Rex");
animal1.fazerSom(); // Chama a versão de Cachorro: "Au au!"
```

Mesmo que a variável seja do tipo `Animal`, o objeto é um `Cachorro`, e o Java é inteligente o suficiente pra chamar o método correto. Isso é o **polimorfismo em tempo de execução**.

Isso é muito útil porque permite tratar objetos diferentes de forma uniforme. Você pode ter um array de `Animal[]` com cachorro, gato e pato dentro, e chamar `fazerSom()` em todos sem saber o tipo específico de cada um.

```java
class Animal {
    String nome;
    Animal(String nome) { this.nome = nome; }

    void fazerSom() {
        System.out.println(nome + " faz algum som...");
    }
}

class Cachorro extends Animal {
    Cachorro(String nome) { super(nome); }

    @Override
    void fazerSom() {
        System.out.println(nome + " faz: Au au!");
    }
}

class Gato extends Animal {
    Gato(String nome) { super(nome); }

    @Override
    void fazerSom() {
        System.out.println(nome + " faz: Miau!");
    }
}

// A mágica: variável do tipo Animal, objeto do tipo específico
Animal[] animais = { new Cachorro("Rex"), new Gato("Mimi") };
for (Animal a : animais) {
    a.fazerSom(); // Java chama a versão correta de cada um
}
// Rex faz: Au au!
// Mimi faz: Miau!
```

### Abstração

Abstração é esconder a complexidade e mostrar só o que é essencial. Em Java, usamos **classes abstratas** e **interfaces** pra isso.

**Classe abstrata:**
- Não pode ser instanciada diretamente (não dá pra fazer `new Forma()`)
- Pode ter métodos abstratos (só a assinatura, sem corpo) que as subclasses são **obrigadas** a implementar
- Pode ter métodos concretos (com corpo) que são herdados normalmente

```java
abstract class Forma {
    abstract double calcularArea(); // Subclasses TÊM QUE implementar
    void exibir() { ... }          // Método concreto, herdado normalmente
}
```

**Interface:**
- É como um "contrato" que a classe se compromete a cumprir
- Todos os métodos são abstratos por padrão
- Uma classe pode implementar **múltiplas interfaces** (resolve o problema da herança múltipla!)
- Usa a palavra-chave `implements`

```java
class Quadrado extends Forma implements Desenhavel, Redimensionavel {
    // Tem que implementar calcularArea(), desenhar() e redimensionar()
}
```

A diferença entre classe abstrata e interface: a classe abstrata pode ter atributos e métodos completos, enquanto a interface é puramente um contrato de "quais métodos você precisa ter". Use classe abstrata quando as subclasses compartilham código em comum, e interface quando classes totalmente diferentes precisam seguir o mesmo contrato.

---

## Métodos

Um `método` é um bloco de codigo que roda apenas quando é chamado. Você pode passar dados, conhecidos como `parâmetros`, para um método. Um método pode retornar dados como resultado.

Além disso, métodos são conhecidos por fazer ações específicas, então eles são conhecidos também como `funções`.

Por que eu deveria utilizar métodos? Para reutilizar código, definir ele uma vez e usar quantas vezes precisar. Além de ser um ótimo e simples jeito de organizar o seu código em "código limpo"

### Criando um método

Um método é criado dentro de uma classe. Ele tem um nome, pode ter parâmetros, e pode retornar um valor. A sintaxe básica para criar um método em Java é a seguinte:

```java
public class MinhaClasse {
    static void meuMetodo() {
        // código do método
    }
}
```

- `MeuMetodo` é o nome do método. Você pode escolher qualquer nome que siga as regras de nomenclatura do Java.
- `static` é um modificador que indica que o método pertence à classe, e não a uma instância específica da classe. Isso significa que você pode chamar o método sem criar um objeto da classe.
- `void` é o tipo de retorno do método, indicando que ele não retorna nenhum valor. Se o método retornar um valor, você deve especificar o tipo de retorno, como `int`, `String`, etc. Vou falar  mais sobre isso em outro diretório.

### Chamando um método

Olha o exemplo abaixo:

```java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!"); // Cria um método simples que imprime um texto
  }

  public static void main(String[] args) {
    myMethod(); // Chama o método myMethod para executar o código dentro dele
  }
}
```

Na primeira parte, nós criamos um método chamado `myMethod` que simplesmente imprime uma mensagem no console. Ele é um método estático, o que significa que podemos chamá-lo diretamente sem precisar criar uma instância da classe `Main`.

Logo abaixo, no método `main`, que é o ponto de entrada do programa, nós chamamos `myMethod()`. Isso faz com que o código dentro de `myMethod` seja executado, e a mensagem "I just got executed!" seja impressa no console.

Lembrando que métodos podem ser chamados diversas vezes caso necessário

```java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
  }
}
```

### Parâmetros e Argumentos

Informações podem ser passadas para métodos através de `parâmetros`. Parãmetros vão funcionar como váriaveis dentro do método. Parâmetros são especificados dentro dos parênteses na definição do método. Você pode ter quantos parâmetros quiser, contanto que as separe com uma vírgula. Por exemplo:

```java
public class Main {
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }

  public static void main(String[] args) {
    myMethod("Liam");
    myMethod("Jenny");
    myMethod("Anja");
  }
}
```

No método acima, criamos uma váriavel string chamada `fname` como parâmetro do método `myMethod`. Quando chamamos `myMethod`, passamos um argumento, que é o valor que queremos que o parâmetro receba. No exemplo, passamos "Liam", "Jenny", e "Anja" como argumentos para `myMethod`. O método então imprime o nome seguido de "Refsnes" no console.

---

Quando um `parâmetro` é passando para um método, ele é chamado de `argumento`. No exemplo acima, "Liam", "Jenny", e "Anja" são argumentos que estão sendo passados para o método `myMethod`.

---

### Multiplos parâmetros

Como citado anteriormente, você pode ter quantos parâmetros quiser em um método, contanto que os separe com vírgula. Por exemplo:

```java
public class Main {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Liam", 5);
    myMethod("Jenny", 8);
    myMethod("Anja", 31);
  }
}
```

Separamos `fname`e `age` com vírgulas, agora a função recebe 2 parâmetros, o que aumenta por consequência a quantidade de argumentos

### Métodos com decisões

```java
public class Metodos_com_decisoes {
  static void checkAge(int age) {
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");
    } else {
      System.out.println("Access granted - You are old enough!");
    }
  }
  public static void main(String[] args) {
    checkAge(20);
  }
}
```

Acima temos um método chamado `checkAge` que recebe um parâmetro inteiro `age`. Dentro do método, utilizamos uma estrutura de decisão `if-else` para verificar se a idade é menor que 18. Se for, o programa imprime "Access denied - You are not old enough!" no console. Caso contrário, ele imprime "Access granted - You are old enough!".

Não tem muito o que detalhar deste código, é só mais um exemplo de como métodos podem ser utilizados para organizar o código e realizar ações específicas, nesse caso, verificar a idade e imprimir uma mensagem apropriada.

### Return nos métodos

Métodos não precisam retornar um valor, como vimos no exemplo do `checkAge`, mas eles também podem retornar um valor. Para isso, você precisa especificar o tipo de retorno do método e usar a palavra-chave `return` para retornar o valor desejado. Por exemplo:

```java
public class Main {
  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }
}
```

No exemplo acima, o método `myMethod` tem um tipo de retorno `int`, o que significa que ele retorna um valor inteiro. Dentro do método, usamos a palavra-chave `return` para retornar o resultado da expressão `5 + x`. Quando chamamos `myMethod(3)`, ele retorna `8`, que é então impresso no console.