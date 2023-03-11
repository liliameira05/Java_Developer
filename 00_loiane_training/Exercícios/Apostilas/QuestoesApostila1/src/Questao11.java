import java.util.Scanner;

public class Questao11 {
    
    public static void main (String[] args){

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis a serem lidas
        int numeroInt1, numeroInt2;
        double numeroReal;

        System.out.println("Insira dois numeros inteiros");
        numeroInt1 = scan.nextInt();
        numeroInt2 = scan.nextInt();

        System.out.println("Insira um numero real");
        numeroReal = scan.nextDouble();

        System.out.println("O produto do dobro do primeiro com a metade do segundo " + (numeroInt1 * 2) * (numeroInt2 / 2));
        System.out.println("A soma do triplo do primeiro com o terceiro " + (numeroInt1 * 3) + (numeroReal));
        System.out.println("O terceiro elevado ao cubo " + Math.pow(numeroReal, 3));
    }
}
