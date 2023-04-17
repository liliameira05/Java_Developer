import java.util.Scanner;

public class Questao36 {

    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int number = 0, start, end;

        do {
            System.out.println("Insert a number between 1 and 10");
            number = scan.nextInt();
        } while (!(number >= 1 && number <= 10));

        do {
            System.out.println("The " + number + " times table will start with: ");
            start = scan.nextInt();
        } while (!(start >= 1 && start <= 10));

        do {
            System.out.println("The " + number + " times table will end with (the number must be greater the start number): ");
            end = scan.nextInt();
        } while (!(end >= 1 && end <= 10 && start <= end));

        System.out.println(number + " times table");
        System.out.println("It starts with: " + start);
        System.out.println("it ends with: " + start);
        for (int index = start; index <= end; index++) {
            System.out.println(number + " x " + index + " = " + index * number);
        }

        scan.close();     
    }
}