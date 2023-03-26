import java.util.Scanner;

public class Questao16 {
    
    public static void main (String[] arg) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double a, b, c, delta, raiz1, raiz2;

        System.out.println("Insira os coeficientes da equacao de 2º grau");
        System.out.println("Coeficiente a");
        a = scan.nextDouble();
        System.out.println("Coeficiente b");
        b = scan.nextDouble();
        System.out.println("Coeficiente c");
        c = scan.nextDouble();

        if (a == 0) {
            System.out.println("Nao e uma equacao de 2º grau");
        } else {
            delta = Math.pow(b, 2) - 4*a*c;
            if (delta < 0) {
                System.out.println("Delta negativo, sem raizes reais");
            } else if (delta == 0) {
                raiz1 = -b / 2*a;
                System.out.println("Delta igual a zero. As raizes sao iguais a " + raiz1);
            } else {
                raiz1 = (-b + Math.sqrt(delta)) / (2*a);
                raiz2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Delta e maior que zero. As raizes sao distintas");
                System.out.println("Raiz 1 e " + raiz1 + " .Raiz 2 e " + raiz2);
            }
        }


    }
}
