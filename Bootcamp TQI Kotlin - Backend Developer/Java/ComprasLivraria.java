import java.text.DecimalFormat;
import java.util.Scanner;

public class ComprasLivraria {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Instancia 2 objetos do tipo "Livro" com os dados de entrada.
    Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
    scanner.nextLine(); // Limpa o buffer do teclado
    Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());

    double valorTotal = calcularValorTotal(livro1, livro2);
    int totalLivros = calcularTotalLivros(livro1, livro2);

    DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        System.out.printf("Valor total da compra: %.2f\n", valorTotal);
        System.out.printf("Numero de livros comprados: %d%n", totalLivros);
        System.out.println("Obrigado por comprar na nossa livraria!");
  }
  
  static class Livro {
    String nome;
    double preco;
    int quantidade;
    
    Livro(String nome, double preco, int quantidade) {
      this.nome = nome;
      this.preco = preco;
      this.quantidade = quantidade;
    }
  }
  
  static double calcularValorTotal(Livro livro1, Livro livro2) {
    double valorTotal = (livro1.preco * livro1.quantidade) + (livro2.preco * livro2.quantidade);
    return valorTotal;
  }
  
  static int calcularTotalLivros(Livro livro1, Livro livro2) {
    int totalLivros = livro1.quantidade + livro2.quantidade;
    return totalLivros;
  }
}