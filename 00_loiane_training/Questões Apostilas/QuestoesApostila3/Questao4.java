
public class Questao4 {

    public static void main (String[] arg) {

        // Criacao das variaveis
        int popA = 80000, popB = 200000, year = 0;

        System.out.println("Case 1");
        while (popA < popB) {
            popA *= 1.03;
            popB *= 1.015;
            year ++;}
        System.out.println("It will be necessary " + year + " years"
        + "\nPopulation A: " + popA
        + "\nPopulation B: " + popB);

        popA = 80000;
        popB = 200000;
        year = 0;
        System.out.println("Case 2");
        while (popA < popB) {
            popA += (popA / 100) * 3;
            popB += (popB / 100) * 1.5;
            year ++;}
        System.out.println("It will be necessary " + year + " years"
        + "\nPopulation A: " + popA
        + "\nPopulation B: " + popB);

        popA = 80000;
        popB = 200000;
        year = 0;
        System.out.println("Case 3");
        while (popA < popB) {
            popA += popA / 100 * 3;
            popB += popB / 100 * 1.5;
            year ++;}
        System.out.println("It will be necessary " + year + " years"
        + "\nPopulation A: " + popA
        + "\nPopulation B: " + popB);

        popA = 80000;
        popB = 200000;
        year = 0;
        System.out.println("Case 4");
        while (popA < popB) {
            popA += popA * 3 / 100;
            popB += popB * 1.5 / 100;
            year ++;}
        System.out.println("It will be necessary " + year + " years"
        + "\nPopulation A: " + popA
        + "\nPopulation B: " + popB);

        popA = 80000;
        popB = 200000;
        year = 0;
        System.out.println("Case 5");
        while (popA < popB) {
            popA += popA * 0.03;
            popB += popB * 0.015;
            year ++;}
        System.out.println("It will be necessary " + year + " years"
        + "\nPopulation A: " + popA
        + "\nPopulation B: " + popB);

        popA = 80000;
        popB = 200000;
        year = 0;
        System.out.println("Case 6");
        while (popA < popB) {
            popA += popA * (3 / 100);
            popB += popB * (1.5 / 100);
            year ++;}
        System.out.println("It will be necessary " + year + " years"
        + "\nPopulation A: " + popA
        + "\nPopulation B: " + popB);

        

    }
    
}
