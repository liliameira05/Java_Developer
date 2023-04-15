import java.util.Scanner;

public class Questao28 {

    public static void main (String[] args) {
        
        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int totalCD;
        double priceCD, sumPrice = 0;

        do {
            System.out.println("How many CDs do you have in your collection?");
            totalCD = scan.nextInt();
        } while (totalCD <= 0);

        for (int eachCD = 1; eachCD <= totalCD; eachCD++) {
            do {
                System.out.println("How much the CD " + eachCD + " was? (It can't be a negative value)");
                priceCD = scan.nextDouble();
            } while (priceCD < 0);

            sumPrice += priceCD;
        }

        System.out.println("The intire collection costed R$ " + sumPrice);
        System.out.println("The average price per CD was R$ " + sumPrice / totalCD);
        scan.close();
    }
    
}
