// Ponto de entrada do projeto organizado.
// Aqui a gente importa o que precisa de cada pacote e usa tudo direitinho.
package com_organizacao;

// Importando as classes dos outros pacotes
import com_organizacao.modelo.Cachorro;
import com_organizacao.modelo.Gato;
import com_organizacao.modelo.Passaro;
import com_organizacao.servico.AnimalServico;

public class Main {
    public static void main(String[] args) {
        // Mesma funcionalidade do Tudo_junto.java, mas agora organizado!
        AnimalServico servico = new AnimalServico(10);

        servico.adicionar(new Cachorro("Rex", "Pastor Alemão"));
        servico.adicionar(new Gato("Mimi", true));
        servico.adicionar(new Passaro("Blu", true));
        servico.adicionar(new Cachorro("Bob", "Golden Retriever"));

        servico.listarTodos();
        System.out.println();
        servico.todosOsSons();

        // Perceba que o Main.java ficou limpo e pequeno.
        // Ele só cria os objetos e chama os métodos.
        // Cada classe cuida do seu próprio código, no seu próprio arquivo.
        //
        // Pra compilar e rodar este exemplo organizado, a partir da
        // pasta "Organização de projeto/":
        //
        //   javac com_organizacao/Main.java com_organizacao/modelo/*.java com_organizacao/servico/*.java
        //   java com_organizacao.Main
    }
}
