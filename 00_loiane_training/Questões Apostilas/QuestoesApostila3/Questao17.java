import java.util.Scanner;

public class Questao17 {

    // It's the same as question 32

    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int number, result = 1;

        do {
            System.out.println("Inser a number (greater or equal to 0) to find its factorial");
            number = scan.nextInt();
        } while (number < 0);

        if (number == 0) {
            System.out.println("0! = 1");
        } else {
            System.out.print(number + "! = ");
            while (number > 1) {
                System.out.print(number + ".");
                result *= number;
                number--;
            }
            System.out.print("1 = " + result);
        }

        scan.close();        
    }
    
}
