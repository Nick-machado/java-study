import java.io.*;

public class IO_Streams {
    public static void main(String[] args) {

        // ===== OUTPUTSTREAM — Escrevendo em arquivo =====
        // FileOutputStream escreve bytes em um arquivo.
        // Se o arquivo não existir, ele cria. Se existir, sobrescreve (a não ser que use append).
        try {
            FileOutputStream fos = new FileOutputStream("saida.txt");
            String texto = "Olá, eu fui escrito com FileOutputStream!\n";
            fos.write(texto.getBytes()); // Converte String em bytes e escreve
            fos.close();
            System.out.println("Arquivo 'saida.txt' criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever: " + e.getMessage());
        }

        // ===== INPUTSTREAM — Lendo de arquivo =====
        // FileInputStream lê bytes de um arquivo.
        try {
            FileInputStream fis = new FileInputStream("saida.txt");
            int caractere;
            System.out.print("Conteúdo lido com FileInputStream: ");
            while ((caractere = fis.read()) != -1) { // -1 = fim do arquivo
                System.out.print((char) caractere); // Converte byte pra char
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }

        // ===== BUFFEREDWRITER — Escrita com buffer (mais eficiente) =====
        // FileWriter + BufferedWriter é a forma mais comum de escrever texto em arquivos.
        try {
            FileWriter fw = new FileWriter("notas.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Primeira linha das notas");
            bw.newLine(); // Pula linha (independente do SO)
            bw.write("Segunda linha das notas");
            bw.newLine();
            bw.write("Terceira linha das notas");

            bw.close(); // Fecha o BufferedWriter (e o FileWriter junto)
            System.out.println("Arquivo 'notas.txt' criado com BufferedWriter!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever: " + e.getMessage());
        }

        // ===== BUFFEREDREADER — Leitura com buffer (mais eficiente) =====
        // FileReader + BufferedReader é a forma mais comum de ler texto de arquivos.
        try {
            FileReader fr = new FileReader("notas.txt");
            BufferedReader br = new BufferedReader(fr);

            String linha;
            System.out.println("Conteúdo lido com BufferedReader:");
            while ((linha = br.readLine()) != null) { // null = fim do arquivo
                System.out.println("  > " + linha);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }

        // ===== TRY-WITH-RESOURCES — Fecha automático =====
        // Ao invés de chamar .close() manualmente, o try-with-resources fecha sozinho.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("auto.txt"))) {
            bw.write("Esse arquivo foi escrito com try-with-resources!");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Lendo com try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader("auto.txt"))) {
            String conteudo = br.readLine();
            System.out.println("Try-with-resources leu: " + conteudo);
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
