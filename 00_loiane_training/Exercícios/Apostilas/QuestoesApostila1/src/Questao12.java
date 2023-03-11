import java.util.Scanner;

public class Questao12 {

    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis de leitura
        double altura;
        double pesoIdeal;

        System.out.println("Qual e a altura?");
        altura = scan.nextDouble();

        pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O peso ideal para a altura informada: " + pesoIdeal);
    }
    
}
