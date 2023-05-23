import java.util.Scanner;

public class IdadePlanetaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double idadeTerrestre = scanner.nextDouble();
    String planeta = scanner.next();
    
    if(planeta.equals("Marte")) {
      double marte = idadeTerrestre / 1.88;
      String m = String.format("%.2f", marte);
      System.out.println("Idade equivalente em Marte: " + m + " anos");
    } else if(planeta.equals("Venus")) {
      double v = Math.round((idadeTerrestre / 0.62) * 100.00) / 100.00;
      System.out.println("Idade equivalente em Venus: " + v + " anos");
    } else if(planeta.equals("Jupiter")) {
      double j = Math.round((idadeTerrestre / 11.86) * 100.00) / 100.00;
      System.out.println("Idade equivalente em Jupiter: " + j + " anos");
    } else
        System.out.println("Planeta invalido.");
    scanner.close();
  }
}