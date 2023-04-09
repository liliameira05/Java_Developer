import java.util.Scanner;

public class Questao5 {

    public static void main (String[] args) {

        // Instancia de leitua
        Scanner scan = new Scanner(System.in);

        // Variaveis
        int popA, popB, year = 0;
        double taxaPopA, taxaPopB;

        do {
            System.out.println("Entre com a população A (maior ou igual a zero)");
            popA = scan.nextInt();
        } while (popA <= 0);

        do {
            System.out.println("Entre com a população B (maior ou igual a zero)");
            popB = scan.nextInt();
            
            if (popB <= popA) {
                System.out.println("A populacao de B deve ser maior que a de A");
            }
        } while (popB <= 0 && popA >= popB);

        do {
            System.out.println("Taxa de crescimento da população A (%). Valor > 0");
            taxaPopA = scan.nextDouble();
        } while (taxaPopA <= 0);

        do {
            System.out.println("Taxa de crescimento da população B (%). Valor > 0");
            taxaPopB = scan.nextDouble();
        } while (taxaPopB <= 0);

        while (popA < popB) {
            popA += (popA / 100) * taxaPopA;
            popB += (popB / 100) * taxaPopB;
            year ++;}
        System.out.println("It will be necessary " + year + " years"
        + "\nPopulation A: " + popA
        + "\nPopulation B: " + popB);


        scan.close();
        
    }
    
}
