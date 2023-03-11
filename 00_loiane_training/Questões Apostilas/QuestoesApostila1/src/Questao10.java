import java.util.Scanner;

public class Questao10 {

    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis de leitura
        double temperaturaF, temperaturaC;

        System.out.println("Temperatura em Celsius");
        temperaturaC = scan.nextDouble();

        temperaturaF = (9 * temperaturaC / 5) - 32;
        System.out.println("A temperatura em Farenheit " + temperaturaF);
        
    }
    
}
