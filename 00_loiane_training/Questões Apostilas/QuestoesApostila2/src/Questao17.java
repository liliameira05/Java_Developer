import java.util.Scanner;

public class Questao17 {
    public static void main (String[] arg) {
        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        int ano;

        System.out.println("Insira o ano a ser analisado");
        ano = scan.nextInt();

        if (ano % 4 == 0) {
            System.out.println(ano + " e bissexto");
        } else {
            System.out.println(ano + " nao e bissexto");
        }
    }
}
