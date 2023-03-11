import java.util.Scanner;

public class Questao4 {

    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis a serem lidas
        int divisor = 4;
        double numero1, numero2, numero3, numero4, media;

        System.out.println("Insira as quatro notas para a média");

        numero1 = scan.nextDouble();
        numero2 = scan.nextDouble();
        numero3 = scan.nextDouble();
        numero4 = scan.nextDouble();

        media = (numero1 + numero2 + numero3 + numero4) / divisor;

        System.out.println("A media das notas e " + media);
        
    }
    
}
