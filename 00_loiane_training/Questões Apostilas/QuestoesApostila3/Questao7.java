import java.util.Scanner;

public class Questao7 {

    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double maiorNumero, numeroAtual;

        System.out.println("Insert a number");
        numeroAtual = scan.nextDouble();
        maiorNumero = numeroAtual;

        for (int numeroIteracao = 2; numeroIteracao <= 5; numeroIteracao++) {

            System.out.println("Insert a number");
            numeroAtual = scan.nextDouble();

            if (numeroAtual > maiorNumero) {
                maiorNumero = numeroAtual;
            }

        }

        System.out.println("The highest number is " + maiorNumero);


        scan.close();
    }
    
}
