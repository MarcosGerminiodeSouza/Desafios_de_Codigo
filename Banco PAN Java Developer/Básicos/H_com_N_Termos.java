import java.util.Scanner;
import java.lang.Math;

public class H_com_N_Termos {
  
  public static void main(String[] Args) {
    Scanner sc = new Scanner(System.in);
    // 1. Inicializar as variáveis.
    double h = 0;
    double n = sc.nextDouble();
    // 2. Realizar os cáuculos.
    for (int i = 1; i <= n; i++) {
      h += (double) 1/i;
    }
    // 3. Imprimir resultado.
    System.out.println(Math.round(h));
  }
}