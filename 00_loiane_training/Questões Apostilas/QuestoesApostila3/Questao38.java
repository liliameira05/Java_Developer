import java.text.DecimalFormat;
import java.time.Year;
import java.util.Scanner;

public class Questao38 {
    public static void main (String[] args) {
        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        double salary = 1000, percentage = 1.5;
        int currentYear = Year.now().getValue();

        DecimalFormat format = new DecimalFormat("###,###.##");

        salary += (salary / 100) * percentage;
        System.out.println("1996: R$ " + format.format(salary) + " - Percentage: " + percentage + "%"); 
        for (int eachYear = 1997; eachYear < currentYear; eachYear++) {
            percentage *= 2;
            salary += (salary / 100) * percentage;
            System.out.println(eachYear + ": R$ " + format.format(salary) + " - Percentage: " + percentage + "%");          
        }

        scan.close();        
    }
    
}
