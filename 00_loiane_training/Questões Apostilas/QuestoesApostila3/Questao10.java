import java.util.Scanner;

public class Questao10 {

    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int number1 = 0, number2 = 0;

        System.out.println("Insert the first number");
        number1 = scan.nextInt();
        
        System.out.println("Insert the second number");
        number2 = scan.nextInt();

        if (number1 >= number2) {
            System.out.println("The second number must be greater than the first");
        } else if (number2 - number1 <= 1) {
            System.out.println("There is no number between the two numbers informed");
        } else {
            System.out.println("The numbers between " + number1 + " and " + number2);
            for (int index = number1 + 1; index < number2; index++) {
                System.out.print(index + " ");}
        }   

        scan.close();
    }
    
}
