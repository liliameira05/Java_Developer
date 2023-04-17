import java.util.Scanner;

public class Questao37 {
    public static void main (String[] args) {
        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int clientCode, nClient = 0;
        double height, weight, sumHeight = 0, sumWeight = 0;
        double maxHeight = Double.MIN_VALUE, minHeight = Double.MAX_VALUE, maxWeight = Double.MIN_VALUE, minWeight = Double.MAX_VALUE;
        String outputMaxHeight = "", outputMinHeight = "", outputMaxWeight = "", outputMinWeight = "";
        System.out.println("To end: insert zero as the cliente code");
        do {
            System.out.println("Insert the client code");
            clientCode = scan.nextInt();

            if (clientCode != 0){
                nClient += 1;
                do {
                    System.out.println("Insert the " + clientCode + " height (m)");
                    height = scan.nextDouble();

                    System.out.println("Insert the " + clientCode + " weight (kg)");
                    weight = scan.nextDouble();

                    if (height <= 0 || weight <= 0) {System.out.println("The height and weight must be positive numbers");}
                } while (height <= 0 || weight <= 0);

                sumHeight += height;
                sumWeight += weight;

                if (height > maxHeight) {maxHeight = height; outputMaxHeight = "The client with the code " + clientCode + " is the tallest: " + maxHeight + " m";}
                if (height < minHeight) {minHeight = height; outputMinHeight = "The client with the code " + clientCode + " is the shortest: " + minHeight + " m";}
                if (weight > maxWeight) {maxWeight = weight; outputMaxWeight = "The client with the code " + clientCode + " is the heaviest: " + maxWeight + " kg";}
                if (weight < minWeight) {minWeight = weight; outputMinWeight = "The client with the code " + clientCode + " is the lightest: " + minWeight + " kg";}
            }
        } while (clientCode != 0);

        System.out.println("The average height is " + (sumHeight / nClient) + " m");
        System.out.println("The average weight is " + (sumWeight / nClient) + " kg");
        System.out.print(outputMaxHeight + "\n" + outputMinHeight + "\n" + outputMaxWeight + "\n" + outputMinWeight);

        scan.close();       
    }
    
}
