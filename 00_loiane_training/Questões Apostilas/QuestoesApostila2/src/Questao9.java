import java.util.Scanner;

public class Questao9 {
    
    public static void main (String[] args){

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double numero1, numero2, numero3, artificio;

        System.out.println("Insira tres numeros");
        numero1 = scan.nextDouble();
        numero2 = scan.nextDouble();
        numero3 = scan.nextDouble();

        if (numero1 > numero2) {
            artificio = numero2;
            numero2 = numero1;
            numero1 = artificio;
        }

        if (numero2 > numero3) {
            artificio = numero3;
            numero3 = numero2;
            numero2 = artificio;
        }

        if (numero1 > numero2) {
            artificio = numero2;
            numero2 = numero1;
            numero1 = artificio;
        }

        System.out.println("A ordem decrescente: " + numero3 + ", " + numero2 + ", " + numero1);

        scan.close();
    }
}
