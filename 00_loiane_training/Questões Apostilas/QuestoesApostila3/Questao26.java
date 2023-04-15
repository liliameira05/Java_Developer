import java.util.Scanner;

public class Questao26 {

    public static void main (String[] args) {

        // Instantiate a scanner object
        Scanner scan = new Scanner(System.in);
        
        // Variables
        int totalVoters = 0, candidateA = 0, candidateB = 0, candidateC = 0;
        String whichCandidate;
        Boolean voteValidated;

        do {
            System.out.println("Insert the total number of voters (> 0)");
            totalVoters = scan.nextInt();
        } while (totalVoters <= 0);

        for (int eachVoter = 1; eachVoter <= totalVoters; eachVoter++) {

            do {
                System.out.println("Vote for candidate A, B ou C");
                whichCandidate = scan.next().toUpperCase();

                voteValidated = true;
                switch (whichCandidate) {
                    case "A": candidateA++; break;
                    case "B": candidateB++; break;
                    case "C": candidateC++; break;
                    default: voteValidated = false; 
                        System.out.println("Vote for a validated candidate");
                        //eachVoter = previousVoter - 1;
                }  
            } while (!voteValidated);

            System.out.println("The voter " + eachVoter + " voted for candidate " + whichCandidate);
        }

        System.out.println("The candidate A had " + candidateA + " votes");
        System.out.println("The candidate B had " + candidateB + " votes");
        System.out.println("The candidate C had " + candidateC + " votes");

        scan.close();
        
    }
    
}
