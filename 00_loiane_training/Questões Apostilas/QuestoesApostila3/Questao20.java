import java.util.Scanner;

public class Questao20 {

    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int number, result;

        do {
            System.out.println("Insert a number (positive and lower than 16) to find its factorial");
            number = scan.nextInt();

            result = 1;
            if (number == 0) {
                System.out.println("0! = 1");
            } else if (number > 0 & number < 16) {
                System.out.print(number + "! = ");
                while (number > 1) {
                    System.out.print(number + ".");
                    result *= number;
                    number--;
                }
                System.out.print("1 = " + result + "\n");
            }
        } while (number >= 0 & number < 16);

        scan.close();        
    }
    
}
