import java.util.Scanner;

public class Taxa_Crescimento {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    double A = input.nextInt();
    double B = input.nextInt();
    int anos = 0;
    
    while (A < B) {
      A += (A * 3 / 100);
      B += (B * 1.5 / 100);
      anos++;
    }
    System.out.println(anos + " anos");
    
  }
}