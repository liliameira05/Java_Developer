import java.util.Scanner;

public class Questao15 {
    
    public static void main (String[] arg) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double lado1, lado2, lado3;

        System.out.println("Insira os lados do triangulo");
        lado1 = scan.nextDouble();
        lado2 = scan.nextDouble();
        lado3 = scan.nextDouble();

        if ((lado1 <= 0) || (lado2 <= 0) || (lado3 <= 0)) {
            System.out.println("Todos os lados devem ser valores positivos");
        } else if ((lado1 + lado2 > lado3) || (lado1 + lado3 > lado2) || (lado2 + lado3 > lado1)) {
            if ((lado1 == lado2) && (lado1 == lado3)) {
                System.out.println("E um triangulo equilatero");
            } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)){
                System.out.println("E um triangulo isoscele");
            } else {
                System.out.println("E um triangulo escaleno");
            }
        } else {
            System.out.println("Nao e um triangulo");
        }

        scan.close();
    }
}
