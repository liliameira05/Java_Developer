import java.util.Scanner;

public class Questao15 {

    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int nTerm, fibonacciTerm = 1, previousFibonacciTerm = 0, variableTemp;

        do {
            System.out.println("How far do you want the fibonacci sequence to go?");
            nTerm = scan.nextInt();
            
            if (nTerm < 1) {
                System.out.println("It needs at least one term");
            }
        } while (nTerm < 1);

        System.out.print(previousFibonacciTerm + " ");

        for (int index = 2; index <= nTerm; index++) {
            System.out.print(fibonacciTerm + " ");
            variableTemp = fibonacciTerm;
            fibonacciTerm += previousFibonacciTerm;
            previousFibonacciTerm = variableTemp;

        }

        scan.close();
    }
    
}
