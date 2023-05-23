import java.util.Scanner;

public class MudancaparaIrlanda {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double salarioBruto = input.nextDouble();
    double beneficios = input.nextDouble();
    double imposto = 0;
    
    if(salarioBruto <= 1100)
      imposto = salarioBruto * 0.05;  
    else if(salarioBruto > 1000 && salarioBruto <= 2500)
      imposto = salarioBruto * 0.10;  
    else
      imposto = salarioBruto * 0.15;
    
    double salarioLiquido = salarioBruto - imposto + beneficios;
    
    System.out.printf("%.2f", salarioLiquido);
  }
}