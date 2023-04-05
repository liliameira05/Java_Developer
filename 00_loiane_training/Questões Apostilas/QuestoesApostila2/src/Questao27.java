import java.util.Scanner;

public class Questao27 {

    public static void main (String[] arg) {

        try (// Instancia de leitura
        Scanner scan = new Scanner(System.in)) {
            // Variaveis
            double kgMorango, kgMaca, valorMorango, valorMaca;

            System.out.println("Insira a qtd em kg de morango");
            kgMorango = scan.nextDouble();

            System.out.println("Insira a qtd em kg de maca");
            kgMaca = scan.nextDouble();

            if (kgMorango <= 5) {
                valorMorango = kgMorango * 2.50;
            } else {
                valorMorango = kgMorango * 2.20;
            }

            if (kgMaca <= 5) {
                valorMaca = kgMaca * 1.80;
            } else {
                valorMaca = kgMaca * 1.50;
            }

            if (kgMaca + kgMorango > 8 || valorMaca + valorMorango > 25) {

                System.out.println("Morango: R$ " + valorMorango
                + "\n Maca: R$ " + valorMaca
                + "\n Total (sem desconto): R$ " + (valorMaca + valorMorango)
                + "\n Total (com desconto de 10%): R$ " + (valorMaca + valorMorango) * 0.90);
            } else {
                System.out.println("Morango: R$ " + valorMorango
                + "\n Maca: R$ " + valorMaca
                + "\n Total (sem desconto): R$ " + (valorMaca + valorMorango));
            }
        }
    }
    
}
