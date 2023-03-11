import java.util.Scanner;

public class Questao3 {
    
    public static void main (String[] args) {
        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis a serem lidas
        double numero1;
        double numero2;

        System.out.println("Insira dois numeros");

        numero1 = scan.nextDouble();
        numero2 = scan.nextDouble();

        System.out.println("A soma dos numeros e " + (numero1 + numero2));
    }
}
