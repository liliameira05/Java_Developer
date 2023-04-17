import java.util.Scanner;

public class Questao33 {

    public static void main (String[] args) {
        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int nTemp;
        double temp, maxTemp = Double.MIN_VALUE, minTemp = Double.MAX_VALUE, sumTemp = 0;

        do {
        System.out.println("Insert the quantity of temperatures (positive number)");
        nTemp = scan.nextInt();
        } while (nTemp <= 0);

        for (int eachTemp = 1; eachTemp <= nTemp; eachTemp++) {
            System.out.println("Insert the temperature " + eachTemp);
            temp = scan.nextDouble();

            sumTemp += temp;
            if (temp > maxTemp) {maxTemp = temp;}
            if (temp < minTemp) {minTemp = temp;}
        }
        
        System.out.println("The average temperature is " + sumTemp / nTemp + "°C");
        System.out.println("The maximun temperature is " + maxTemp + "°C");
        System.out.println("The minimum temperature is " + minTemp + "°C");

        scan.close();
    }
    
}
