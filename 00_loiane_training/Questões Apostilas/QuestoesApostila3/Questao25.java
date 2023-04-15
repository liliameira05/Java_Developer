import java.util.Scanner;

public class Questao25 {

    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);
        
        // Variables
        int nPeople, age = 0;
        double sumAge = 0, averageAge;
        boolean ageOk;

        System.out.println("How many people?");
        nPeople = scan.nextInt();

        for (int eachPerson = 1; eachPerson <= nPeople; eachPerson++){
            ageOk = true;
            while (ageOk) {
                System.out.println("Insert the person " + eachPerson + "'s age");
                age = scan.nextInt();

                if (age >= 0 && age <= 100) {ageOk = false;
                } else {System.out.println("The age must be a number between 0 and 100");}}
            
            sumAge += age;
        }

        averageAge = sumAge / nPeople;

        System.out.println("The average age is " + averageAge);

        if (averageAge >= 0 && averageAge <= 25) { System.out.println("Young");
        } else if (averageAge >= 26 && averageAge <= 60) { System.out.println("Adult");
        } else { System.out.println("Old");}
        
    scan.close();
    }
    
}
