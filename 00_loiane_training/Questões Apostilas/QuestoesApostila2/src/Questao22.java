import java.util.Scanner;

public class Questao22 {
    public static void main (String[] arg) {
        // Instancia de leitua
        Scanner scan = new Scanner(System.in);

        // Variaveis
        int numero;

        System.out.println("Insira o numero");
        numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("E um numero par");
        } else {
            System.out.println("E um numero impar");
        }

        scan.close();
    }    
}
