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