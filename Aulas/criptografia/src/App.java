import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        
        for (int i = 0; i < N; i++) {
            String line = in.readLine();
            char[] chars = line.toCharArray();
            int len = chars.length;
            
            // 1) Deslocar as letras (alfabéticas) +3 no ASCII
            for (int j = 0; j < len; j++) {
                char c = chars[j];
                if (Character.isLetter(c)) {
                    chars[j] = (char) (c + 3);
                }
            }
            
            // 2) Inverter o array de caracteres
            for (int j = 0; j < len / 2; j++) {
                char temp = chars[j];
                chars[j] = chars[len - 1 - j];
                chars[len - 1 - j] = temp;
            }
            
            // 3) Do meio em diante, deslocar -1 no ASCII
            for (int j = len / 2; j < len; j++) {
                chars[j] = (char) (chars[j] - 1);
            }
            
            // Exibir o resultado criptografado
            System.out.println(new String(chars));
        }
    }
}
