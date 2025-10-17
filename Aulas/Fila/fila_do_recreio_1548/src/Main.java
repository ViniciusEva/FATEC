import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Usa BufferedReader para leitura rápida da entrada
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        String linha;
        
        // Lê o número de casos de teste
        int numCasos = Integer.parseInt(br.readLine().trim());

        // Processa cada caso de teste
        for (int c = 0; c < numCasos; c++) {
            // N é o número de alunos (não precisamos dele diretamente, mas é bom ler)
            int N = Integer.parseInt(br.readLine().trim()); 
            
            // Lê a linha com as notas
            linha = br.readLine();
            StringTokenizer st = new StringTokenizer(linha);

            // 1. Usa uma Queue (Fila) para representar a ordem original
            // Embora List/Array seja mais direto, usamos Queue conforme solicitado.
            Queue<Integer> filaOriginalQueue = new LinkedList<>();
            
            // Também criamos uma List auxiliar para a ordenação, mantendo a ordem original
            List<Integer> filaOriginalList = new ArrayList<>(N); 
            
            // 2. Preenche a Fila e a Lista com as notas na ordem de entrada
            for (int i = 0; i < N; i++) {
                int nota = Integer.parseInt(st.nextToken());
                filaOriginalQueue.offer(nota); 
                filaOriginalList.add(nota);
            }
            
            // 3. Cria a Fila Ordenada (usando uma Lista para ordenar)
            
            // A fila ordenada é a filaOriginalList (que contém a ordem original)
            // mas agora reordenada.
            List<Integer> filaOrdenadaList = new ArrayList<>(filaOriginalList);
            
            // Ordena a lista em ordem decrescente (maior nota na frente)
            // Usamos Collections.sort e Comparator.reverseOrder() para ordem decrescente.
            Collections.sort(filaOrdenadaList, Comparator.reverseOrder());
            
            // 4. Compara as filas (Listas) para contar as posições iguais
            int mudaramDePosicao = 0;
            for (int i = 0; i < N; i++) {
                // Compara a nota na posição 'i' da fila original 
                // com a nota na posição 'i' da fila reordenada.
                if (filaOriginalList.get(i).equals(filaOrdenadaList.get(i))) {
                    mudaramDePosicao++;
                }
            }
            
            // Adiciona o resultado ao StringBuilder
            output.append(mudaramDePosicao).append("\n");
        }
        
        // Imprime toda a saída de uma só vez
        System.out.print(output.toString());
    }
}