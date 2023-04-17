/* Desafio: Imprimindo Positivos e Média
import java.util.Scanner;

public class Imprimindo_Positivos_Media {

	public static void main(String[] args) {
		
		float n1,total = 0,media = 0;
		int totalNumber = 0;
		Scanner leitor =new Scanner(System.in);
		for (int i = 1; i <= 6; i++) {
			n1 = leitor.nextFloat();
			if (n1 > 0) {
				totalNumber += 1;
				total += n1;
			}
		}
		media = total / totalNumber;
		
		System.out.print(totalNumber+" valores positivos\n");
		System.out.printf("%.1f\n",media);
	}

}
*/