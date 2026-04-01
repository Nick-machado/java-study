import java.util.LinkedList;

public class LinkedList_em_java {
    public static void main(String[] args) {
        // LinkedList: lista encadeada onde cada elemento aponta para o próximo.
        // Diferente do ArrayList (que usa array por baixo), a LinkedList é
        // mais eficiente para INSERIR e REMOVER elementos, mas mais lenta
        // para ACESSAR por índice.
        // Implementa tanto List quanto Deque (fila de duas pontas).

        // === CRIANDO LINKEDLIST ===
        System.out.println("=== Criando LinkedList ===");
        LinkedList<String> tarefas = new LinkedList<>();
        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");
        tarefas.add("Revisar código");
        System.out.println("Tarefas: " + tarefas);

        // === MÉTODOS EXCLUSIVOS DA LINKEDLIST ===
        // Esses métodos NÃO existem no ArrayList!
        System.out.println("\n=== Métodos exclusivos ===");

        // addFirst / addLast: adicionar nas pontas
        tarefas.addFirst("Tomar café");
        tarefas.addLast("Dormir");
        System.out.println("Após addFirst/addLast: " + tarefas);
        // [Tomar café, Estudar Java, Fazer exercícios, Revisar código, Dormir]

        // getFirst / getLast: acessar as pontas
        System.out.println("Primeira: " + tarefas.getFirst()); // Tomar café
        System.out.println("Última: " + tarefas.getLast());     // Dormir

        // removeFirst / removeLast: remover das pontas
        tarefas.removeFirst();
        tarefas.removeLast();
        System.out.println("Após removes: " + tarefas);
        // [Estudar Java, Fazer exercícios, Revisar código]

        // === USANDO COMO FILA (Queue) ===
        System.out.println("\n=== LinkedList como Fila (FIFO) ===");
        // FIFO = First In, First Out (primeiro a entrar, primeiro a sair)
        LinkedList<String> fila = new LinkedList<>();

        // offer: adiciona no final da fila
        fila.offer("Cliente 1");
        fila.offer("Cliente 2");
        fila.offer("Cliente 3");
        System.out.println("Fila: " + fila); // [Cliente 1, Cliente 2, Cliente 3]

        // peek: olha o primeiro SEM remover
        System.out.println("Próximo: " + fila.peek()); // Cliente 1

        // poll: remove e retorna o primeiro
        String atendido = fila.poll();
        System.out.println("Atendido: " + atendido);   // Cliente 1
        System.out.println("Fila agora: " + fila);     // [Cliente 2, Cliente 3]

        // === USANDO COMO PILHA (Stack) ===
        System.out.println("\n=== LinkedList como Pilha (LIFO) ===");
        // LIFO = Last In, First Out (último a entrar, primeiro a sair)
        LinkedList<String> pilha = new LinkedList<>();

        // push: empilha (adiciona no topo)
        pilha.push("Página 1");
        pilha.push("Página 2");
        pilha.push("Página 3");
        System.out.println("Pilha: " + pilha); // [Página 3, Página 2, Página 1]

        // peek: olha o topo SEM remover
        System.out.println("Topo: " + pilha.peek()); // Página 3

        // pop: desempilha (remove do topo)
        String removida = pilha.pop();
        System.out.println("Removida: " + removida);  // Página 3
        System.out.println("Pilha agora: " + pilha);  // [Página 2, Página 1]

        // === MÉTODOS COMUNS (mesmos do ArrayList) ===
        System.out.println("\n=== Métodos comuns ===");
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        System.out.println("Lista: " + numeros);            // [10, 20, 30, 40]
        System.out.println("Tamanho: " + numeros.size());   // 4
        System.out.println("Elemento 2: " + numeros.get(2)); // 30
        System.out.println("Contém 20? " + numeros.contains(20)); // true

        numeros.set(1, 25);  // Substitui posição 1
        numeros.remove(0);   // Remove posição 0
        System.out.println("Após edições: " + numeros); // [25, 30, 40]

        // Percorrendo com for-each
        System.out.println("\n=== Percorrendo ===");
        for (int num : numeros) {
            System.out.println("Número: " + num);
        }

        // === COMPARAÇÃO: ARRAYLIST vs LINKEDLIST ===
        System.out.println("\n=== ArrayList vs LinkedList ===");
        System.out.println("ArrayList: array interno, acesso rápido por índice (get)");
        System.out.println("LinkedList: nós encadeados, inserção/remoção rápida nas pontas");
        System.out.println("Ambos implementam a interface List!");
    }
}
