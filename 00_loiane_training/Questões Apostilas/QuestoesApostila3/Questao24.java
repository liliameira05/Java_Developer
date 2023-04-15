import java.util.Scanner;

public class Questao24 {
    public static void main (String[] args) {
       
        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);

        // Variables
        int nGrades;
        double sumGrades = 0, grade;

        System.out.println("Insert the number of grades");
        nGrades = scan.nextInt();

        for (int eachGrade = 1; eachGrade <= nGrades; eachGrade++) {
            System.out.println("Insert a grade " + eachGrade);
            grade = scan.nextDouble();
            sumGrades += grade;
        }

        System.out.println("Average: " + sumGrades / nGrades);
        scan.close();
    }   
}
