import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double numero1, numero2;

        System.out.println("Insira o primeiro numero");
        numero1 = scan.nextDouble();
        System.out.println("Insira o segundo numero");
        numero2 = scan.nextDouble();

        if (numero1 > numero2) {
            System.out.println("O primeiro numero e maior que o segundo");
        } else if(numero1 < numero2) {
            System.out.println("O segundo numero e maior que o primeiro");
        } else {
            System.out.println("Os numeros sao iguais");
        }
    }
}
