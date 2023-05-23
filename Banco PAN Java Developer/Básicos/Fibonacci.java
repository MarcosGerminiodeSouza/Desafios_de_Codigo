import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        // 1. Inicializar variáveis. 
        int get = leitor.nextInt();
        // 2. Realizar os caúculos.
        int a = 0;
        int b = 1;
        int c = a + b;
        // 3. Imprime os resultado na mesma linha.
        for (int i = 0; i < get; i++) {
          System.out.print(a + " ");
          a = b;
          b = c;
          c = a + b;
        }
    }
}