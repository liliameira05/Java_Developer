import java.util.Scanner;

public class Questao13 {

    public static void main (String[] args) {
        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int base, power, result = 1;

        System.out.println("Insert the base");
        base = scan.nextInt();

        System.out.println("Insert the power");
        power = scan.nextInt();

        if (power != 0) {
            for (int times = 1; times <= power; times++) {
                result *= base;
            }
        }

        System.out.println(base + " by the power of " + power + " is " + result);

        scan.close();
    }
    
}
