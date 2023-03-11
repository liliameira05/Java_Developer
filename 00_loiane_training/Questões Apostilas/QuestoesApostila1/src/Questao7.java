import java.util.Scanner;

public class Questao7 {
    
    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis a serem lidas
        double arestaQuadrado;
        double area;

        System.out.println("Qual é o comprimento do quadrado");
        arestaQuadrado = scan.nextDouble();

        area = Math.pow(arestaQuadrado, 2) * 2;

        System.out.println("O dobro da area do quadrado e " + area);

    }
}
