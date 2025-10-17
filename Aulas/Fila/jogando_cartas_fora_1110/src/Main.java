import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors; // Necessário para o Collectors.joining

public class Main {
    public static void main(String[] args) throws IOException {
        // Usa BufferedReader para leitura rápida da entrada
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;
        
        // Usa StringBuilder para construir a saída de forma eficiente
        StringBuilder output = new StringBuilder();

        // Loop principal para processar múltiplos casos de teste. 
        // A leitura para quando a linha é nula ou o valor é 0.
        while ((linha = br.readLine()) != null) {
            int N;
            try {
                N = Integer.parseInt(linha.trim());
            } catch (NumberFormatException e) {
                // Fim inesperado da entrada
                break;
            }

            if (N == 0) {
                break; // A entrada termina com 0
            }

            // A Fila armazena as cartas, de 1 (topo) a N (base).
            Queue<Integer> deck = new LinkedList<>();
            for (int i = 1; i <= N; i++) {
                deck.offer(i);
            }

            // Lista para armazenar as cartas descartadas na ordem
            // Usamos LinkedList aqui porque é rápido para inserções e iterações.
            LinkedList<Integer> discarded = new LinkedList<>();

            // Simulação do jogo: continua enquanto houver 2 ou mais cartas
            while (deck.size() >= 2) {
                // 1. Joga fora a carta do topo
                int discardedCard = deck.poll();
                discarded.add(discardedCard); 

                // 2. Move a próxima carta para a base
                int nextCard = deck.poll();
                deck.offer(nextCard); 
            }

            // --- Formatação da Saída no StringBuilder ---

            // Constrói a linha "Discarded cards: X, Y, Z"
            output.append("Discarded cards: ");
            
            // Junta os elementos da lista discarded com ", "
            // Usar o Stream API para juntar é limpo e eficiente para a formatação
            String discardedString = discarded.stream()
                                              .map(String::valueOf)
                                              .collect(Collectors.joining(", "));
            
            output.append(discardedString).append("\n");

            // Constrói a linha "Remaining card: W"
            // Após o loop, deck terá exatamente 1 carta (se N >= 1)
            if (!deck.isEmpty()) {
                output.append("Remaining card: ").append(deck.poll()).append("\n");
            } else {
                // Caso N=1, deck estará vazia se N=0, o que é tratado, mas por segurança
                // se N=1, o loop nem executa e deck.poll() será a carta 1.
                // Se N=1, o deck.poll() seria 1
                if (N == 1) {
                    // O caso N=1 nunca entra no while, então a primeira carta (1) é a restante.
                    // O deck.poll() deve ser feito no final do loop.
                    // Já que a lógica atual do loop acima garante que deck.size() será 1,
                    // a linha acima ('if (!deck.isEmpty())') já lida com N=1.
                }
            }
        }
        
        // Imprime toda a saída de uma só vez, reduzindo I/O overhead
        System.out.print(output.toString());
    }
}