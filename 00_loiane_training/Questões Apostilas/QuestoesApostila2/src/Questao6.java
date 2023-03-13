import java.util.Scanner;

public class Questao6 {
    
    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double numero1, numero2, numero3, maiorNumero;

        System.out.println("Insira tres numeros");
        numero1 = scan.nextDouble();
        numero2 = scan.nextDouble();
        numero3 = scan.nextDouble();

        maiorNumero = numero1;
        if (maiorNumero < numero2){
            maiorNumero = numero2;
        }
        if (maiorNumero < numero3){
            maiorNumero = numero3;
        }

        System.out.println("O maior numero e " + maiorNumero);
    }
}
