import java.util.Scanner;

public class Questao13 {

    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis de leitura
        double altura;
        double peso;
        double pesoIdealHomem;
        double pesoIdealMulher;

        System.out.println("Qual e a altura?");
        altura = scan.nextDouble();

        System.out.println("Qual e o peso?");
        peso = scan.nextDouble();

        pesoIdealHomem = (72.7 * altura) - 58;
        pesoIdealMulher = (62.1 * altura) - 44.7;

        System.out.println("O peso ideal de um homem para a altura informada: " + pesoIdealHomem);
        System.out.println("O peso ideal de uma mulher para a altura informada: " + pesoIdealMulher);

        if (peso > pesoIdealHomem) {
            System.out.println("O peso informado maior que o ideal para um homem");
        } else if (peso < pesoIdealHomem) {
            System.out.println("O peso informado menor que o ideal para um homem");
        } else {
            System.out.println("O peso informado e ideal para um homem");
        }

        if (peso > pesoIdealMulher) {
            System.out.println("O peso informado maior que o ideal para uma mulher");
        } else if (peso < pesoIdealMulher) {
            System.out.println("O peso informado menor que o ideal para uma mulher");
        } else {
            System.out.println("O peso informado e ideal para uma mulher");
        }

        
    }
    
}
