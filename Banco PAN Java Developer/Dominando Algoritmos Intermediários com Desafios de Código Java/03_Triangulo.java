/* Desafio: Triângulo
import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) throws IOException {
	  Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double maior = 0;
		double soma = 0;
		boolean triangulo = false;
		
		triangulo = (A + B > C) && (A + C > B) && (B + C > A);
		
		if (triangulo) {
		  soma = A + B + C;
		  System.out.printf( "Perimetro = " + "%.1f", soma);
		} else {
		  soma = ((A + B) * C)/2;
		  System.out.printf( "Area = " + "%.1f", soma);
		}
		
	}
}
*/