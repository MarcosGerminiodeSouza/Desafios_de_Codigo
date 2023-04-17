/* Desafio: Fibonacci Fácil.
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
*/
/* //Também da certo
import java.io.IOException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
          if (i == N) System.out.println(anterior);
       
          else System.out.print(anterior + " ");
        	proximo = anterior + atual;
        	anterior = atual; 
        	atual =  proximo; 
        }
    }
}*/
