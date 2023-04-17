/* Desafio: Conta Espaços e Vogais
import java.util.Scanner;

public class Espacos_e_Vogais {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String frase = sc.nextLine();
    String[] strSplit = frase.split(" ");
    char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
    int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
    
    frase = frase.toLowerCase();
    for (int i = 0; i < frase.length(); i++) {
      char c = frase.charAt(i);
      if (c == 32)
        continue;
      if (c == 97 | c == 101 | c == 105 | c == 111 | c == 117) {
        quantVogais++;
        continue;
      }
    }
    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
  }
}
*/