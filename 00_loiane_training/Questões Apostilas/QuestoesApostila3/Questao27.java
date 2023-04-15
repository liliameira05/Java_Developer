import java.util.Scanner;

public class Questao27 {

    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);
        
        // Variables
        int numberClassrooms, studentsClassroom, sumStudents = 0;

        do {
            System.out.println("Insert the number of classrooms (it must be greater than 0)");
            numberClassrooms = scan.nextInt();
        } while (numberClassrooms <= 0);

        for (int eachClassroom = 1; eachClassroom <= numberClassrooms; eachClassroom++) {
            do {
                System.out.println("How many students are in the classroom " + eachClassroom);
                studentsClassroom = scan.nextInt();

                if (studentsClassroom > 40) {
                    System.out.println("Each classroom must have at most 40 students");
                } else if (studentsClassroom < 0) {
                    System.out.println("The number of students must be greater than 0");
                }

            } while(studentsClassroom > 40 || studentsClassroom < 0);

            sumStudents += studentsClassroom;
        }

        System.out.println("Total: " + sumStudents + " students");
        System.out.println("Average by classroom: " + sumStudents / numberClassrooms + " students");
        scan.close();
    }
    
}
