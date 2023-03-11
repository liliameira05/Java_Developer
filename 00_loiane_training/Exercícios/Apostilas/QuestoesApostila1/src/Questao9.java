import java.util.Scanner;

public class Questao9 {
    
    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis de leitura
        double temperaturaF, temperaturaC;

        System.out.println("Temperatura em Farenheit");
        temperaturaF = scan.nextDouble();

        temperaturaC = (5 * (temperaturaF - 32) / 9);
        System.out.println("A temperatura em Celsius " + temperaturaC);
        
    }

}
