/* Desafio: Fábrica de Carros.
import java.util.*;

public class calcularImpostos {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  // 1. Inicializar variáveis.
    int custoFabrica = scan.nextInt();
	  int porcentagemDistribuidor = scan.nextInt();
	  int percentualImpostos = scan.nextInt();
    int distribuidor;
    int impostos;
	  int consumidor;
    // 2. Realizar os cáuculos.
    distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
    impostos = (custoFabrica * percentualImpostos) / 100;
    consumidor = custoFabrica + (distribuidor + impostos);
    // 3. Imprimir resultado.
    System.out.println(consumidor);
	}
}
*/