import java.util.Scanner;

public class Questao14 {

    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int number, numberOdd = 0, numberEven = 0;

        for (int index = 1; index <= 10; index++) {
            System.out.println("Insert a number");
            number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is an even number");
                numberEven++;
            } else {
                System.out.println(number + " is an odd number");
                numberOdd++;
            }
        }

        System.out.println("There are " + numberEven + " even numbers");
        System.out.println("There are " + numberOdd + " odd numbers");
        scan.close();
    }
    
}
