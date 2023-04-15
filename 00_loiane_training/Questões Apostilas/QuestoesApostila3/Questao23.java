import java.util.Scanner;

public class Questao23 {
    
    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int numberN, numberDivison = 2; // Number de divisions is 2, because it counts the divison by 1 and the number itself
        boolean numberPrime;

        System.out.println("Insert a number");
        numberN = scan.nextInt();

        for (int number = 2; number < numberN; number++) {
            numberPrime = true;
            numberDivison++;
            /* Check if the numbers between 1 and N is prime:
             * It starts from the number -1 so the number it self is not considered to check if it's prime or not
             * Equal or greater than 2, because 2 is the lowest prime number
             * If it's not prime, the for loop ends (break)
             */
            for (int index = number - 1; index >= 2; index--) {
                if (numberPrime && number % index == 0) {
                    numberPrime = false;
                    break;
                }
            }

            if (numberPrime) {System.out.println(number + " is a prime number between 1 and " + number);}
        }

        System.out.println(numberDivison + " divisions were made");
        scan.close();        
    }
}
