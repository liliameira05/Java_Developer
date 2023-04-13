import java.util.Scanner;

public class Questao19 {

    public static void main (String[] args) {

        // Instantiate a scanner object
    Scanner scan = new Scanner(System.in);

    // Variables
    int numberGroup, number, greatestNumber = Integer.MIN_VALUE, lowestNumber = Integer.MAX_VALUE, sum = 0;

    do {
        System.out.println("How many numbers will be analysed?");
        numberGroup = scan.nextInt();

        if (numberGroup < 1) {
            System.out.println("It must be a positive number");
        }
    } while (numberGroup < 1);

    for (int index = 1; index <= numberGroup; index++) {
        do {
            System.out.println("Number " + index + ": Insert an integer number between 0 and 1000");
            number = scan.nextInt();
        } while (!(number >=0 & number <= 1000));

        if (number > greatestNumber) {
            greatestNumber = number;
        }

        if (number < lowestNumber) {
            lowestNumber = number;
        }

        sum += number;
    }

    System.out.println("The greatest number is " + greatestNumber);
    System.out.println("The lowest number is " + lowestNumber);
    System.out.println("The sum is " + sum);

    scan.close();
        
    }
}