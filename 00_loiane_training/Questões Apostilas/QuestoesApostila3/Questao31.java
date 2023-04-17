import java.util.Scanner;

public class Questao31 {

    public static void main (String[] args) {
        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        double price, total = 0, paidClient;
        String client, output = "Lojas Tabajaras";

        do {

        System.out.println("Is there a client? \nEnter 'yes' if so");
        client = scan.next();

        if (client.equalsIgnoreCase("yes")) {
            int nProduct = 0;
            
            do {
                nProduct++;

                System.out.println("Insert the product " + nProduct + " price \nEnter 0 to stop");
                price = scan.nextDouble();
                total += price;
                
                output += "\nProduto " + nProduct + ": R$ " + price;
            } while (price != 0);
            System.out.println("Total: R$ " + total);
            output += "\nTotal: R$ " + total;

            do {
            System.out.println("How much did the client give you?");
            paidClient = scan.nextDouble();
            
            if (paidClient <= 0) {
                System.out.println("The paid value must be greater than 0");
            } else if(paidClient < total) {
                System.out.println("The client still needs to pay R$ " + (total - paidClient));
            }else {
                output += "\nPaid: R$ " + paidClient + "\nChange: R$ " + (paidClient - total);
            }} while (paidClient < total);
            
            System.out.println(output);
        }} while (client.equalsIgnoreCase("yes"));


        
        
        scan.close();
    }
    
}
