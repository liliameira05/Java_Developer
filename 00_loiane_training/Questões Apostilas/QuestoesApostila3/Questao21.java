import java.util.Scanner;

public class Questao21 {

    // It's the same as question 34
    
    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int number, countDivider = 0;

        System.out.println("Insert a number");
        number = scan.nextInt();

        for (int divider = 2; divider < number; divider++) {
            if (number % divider == 0) {
                countDivider++;
            }
        }

        if (countDivider > 0) {
            System.out.println(number + " is not a prime number");
        } else {
            System.out.println(number + " is a prime number");
        }

        scan.close();        
    }
}
