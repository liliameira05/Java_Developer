import java.util.Scanner;

public class Questao22 {
    
    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int number;
        boolean isPrime = true;

        System.out.println("Insert a number");
        number = scan.nextInt();

        for (int divider = 2; divider < number; divider++) {
            if (isPrime && number % divider == 0) {
                System.out.println(number + " is not a prime number");
                System.out.println(number + " is divisible by " + divider);
                isPrime = false;
            } else if (number % divider == 0) {
                System.out.println(number + " is divisible by " + divider);}
        }

        if (isPrime) {
            System.out.println(number + " is a prime number");}

        scan.close();        
    }
}