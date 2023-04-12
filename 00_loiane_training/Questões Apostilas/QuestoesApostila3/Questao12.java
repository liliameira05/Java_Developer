import java.util.Scanner;

public class Questao12 {

    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int number = 0;

        do {
            System.out.println("Insert a number between 1 and 10");
            number = scan.nextInt();
        } while (!(number >= 1 & number <= 10));

        System.out.println(number + " times table");
        for (int index = 1; index <= 10; index++) {
            System.out.println(number + " x " + index + " = " + index * number);
        }

        scan.close();
        
    }
    
}
