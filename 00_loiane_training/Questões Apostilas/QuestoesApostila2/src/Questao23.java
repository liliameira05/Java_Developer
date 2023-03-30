import java.util.Scanner;

public class Questao23 {

    public static void main (String[] arg) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double varTeste;

        System.out.println("Insira um numero");
        varTeste = scan.nextDouble();

        if (Math.round(varTeste) == varTeste) {
            System.out.println("Numero inteiro");
        } else {
            System.out.println("Numero decimal");
        }
    }
    
}
