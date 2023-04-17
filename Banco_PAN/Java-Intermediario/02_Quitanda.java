/* Desafio: Quitanda do Seu Zé
import java.util.*;

public class Quitanda_Seu_Ze {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int morangos = input.nextInt();
    int macas = input.nextInt();
    input.close();
    
    Double custoTotal = morangos * (morangos > 5 ? 2.2 : 2.5) + macas * (macas > 5 ? 1.5 : 1.8);
    
    System.out.println(morangos + macas > 8 || custoTotal > 25.00 ? custoTotal * 0.9 : custoTotal);
    
  }
}
 */