import java.util.Scanner;

public class Questao16 {

    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int variableTemp, fibonacciTerm = 1, previousFibonacciTerm = 0;

        System.out.print(previousFibonacciTerm + " " + fibonacciTerm + " ");
        while (fibonacciTerm <= 500) {
            variableTemp = fibonacciTerm;
            fibonacciTerm += previousFibonacciTerm;
            previousFibonacciTerm = variableTemp;
            System.out.print(fibonacciTerm + " ");
        }

        scan.close();
        
    }
    
}
