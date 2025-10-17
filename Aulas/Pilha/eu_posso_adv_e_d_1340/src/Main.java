import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Usar BufferedReader e StringTokenizer para leitura mais rápida
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        // O loop principal continua enquanto houver linhas para ler (enquanto houver um novo caso de teste)
        while ((linha = br.readLine()) != null) {
            int N;
            try {
                N = Integer.parseInt(linha.trim());
            } catch (NumberFormatException e) {
                // Se a linha não for um número válido, pode ser o fim da entrada
                break;
            }

            // Inicialização das três estruturas de dados para cada caso de teste
            Stack<Integer> stack = new Stack<>();
            Queue<Integer> queue = new LinkedList<>();
            // A PriorityQueue em Java é um min-heap por padrão.
            // Para simular o comportamento de fila de prioridade (o maior é removido primeiro),
            // usamos Collections.reverseOrder().
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);

            // Variáveis booleanas para rastrear se o comportamento ainda é compatível
            boolean isStack = true;
            boolean isQueue = true;
            boolean isPriorityQueue = true;

            // Processa as N operações
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int operation = Integer.parseInt(st.nextToken());
                int value = Integer.parseInt(st.nextToken());

                if (operation == 1) { // Operação de inserção (PUSH)
                    if (isStack) {
                        stack.push(value);
                    }
                    if (isQueue) {
                        queue.offer(value);
                    }
                    if (isPriorityQueue) {
                        priorityQueue.offer(value);
                    }
                } else { // operation == 2 - Operação de remoção (POP)
                    if (isStack) {
                        if (stack.isEmpty() || stack.pop() != value) {
                            isStack = false;
                        }
                    }
                    if (isQueue) {
                        if (queue.isEmpty() || queue.poll() != value) {
                            isQueue = false;
                        }
                    }
                    if (isPriorityQueue) {
                        if (priorityQueue.isEmpty() || priorityQueue.poll() != value) {
                            isPriorityQueue = false;
                        }
                    }
                }
            }

            // Contagem de quantas estruturas ainda são candidatas
            int count = 0;
            if (isStack) count++;
            if (isQueue) count++;
            if (isPriorityQueue) count++;

            // Impressão do resultado
            if (count == 0) {
                System.out.println("impossible");
            } else if (count > 1) {
                System.out.println("not sure");
            } else {
                if (isStack) {
                    System.out.println("stack");
                } else if (isQueue) {
                    System.out.println("queue");
                } else if (isPriorityQueue) {
                    System.out.println("priority queue");
                }
            }
        }
    }
}