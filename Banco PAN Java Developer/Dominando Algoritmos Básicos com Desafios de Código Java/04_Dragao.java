/* Desafio: Dragão!
import java.util.*;

public class Dragon_Ball_Z {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    // 1. Inicializar variáveis.
    int casos, poderDeLuta;
    casos = ler.nextInt();
    // 2. Realizar cáuculo, Ler a entrada e Imprimir o resultado.
    for(int i = 0; i < casos; i++) {
      poderDeLuta = ler.nextInt();
      
      if(poderDeLuta <= 8000)
        System.out.println("Inseto!");
      else
        System.out.println("Mais de 8000!");
    }
  }
}
*/