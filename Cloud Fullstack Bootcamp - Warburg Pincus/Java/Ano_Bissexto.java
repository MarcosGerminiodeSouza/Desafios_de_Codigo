import java.util.Scanner;

public class Ano_Bissexto {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int ano;
    
        ano = ent.nextInt();
        if (ano % 400 == 0)
          System.out.println("Bissexto");
        else if(ano % 4 == 0 && ano % 100 != 0)
          System.out.println("Bissexto");
        else
          System.out.println("Nao Bissexto");
    }
}