import java.util.Scanner;

public class Questao8 {

    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double sum = 0, newNumber;

        for (int index = 0; index < 5; index++) {
            System.out.println("Insert a number");
            newNumber = scan.nextDouble();

            sum += newNumber;
        }

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + sum / 5);

        scan.close();
    }
    
}
