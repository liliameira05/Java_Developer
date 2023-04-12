import java.util.Scanner;

public class Questao11 {

    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int number1 = 0, number2 = 0, sum = 0;

        System.out.println("Insert the first number");
        number1 = scan.nextInt();
        
        System.out.println("Insert the second number");
        number2 = scan.nextInt();

        if (number1 >= number2) {
            System.out.println("The second number must be greater than the first");
        } else {
            for (int index = number1; index <= number2; index++) {
                sum += index;}
            System.out.println("The sum of all numbers is " + sum);
        }

        scan.close();
    }
    
}