
import java.util.Scanner;

public class Questao24 {

    public static void main (String[] arg) {
        
        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double num1, num2, resultado = 0;
        String operacao;
        Boolean operacaoValida = true;

        System.out.println("Insira dois numeros");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();

        System.out.println("Insira a operacao");
        operacao = scan.next();
        switch (operacao) {
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/": resultado = num1 / num2; break;
            case "**": resultado = Math.pow(num1, num2);
            default: operacaoValida = false;
        }

        if (operacaoValida) {
            if (resultado % 2 == 0) {
                System.out.println("Numero par");
            } else {
                System.out.println("Numero impar");
            }

            if (resultado < 0) {
                System.out.println("Numero negativo");
            } else {
                System.out.println("Numero positivo");
            }

            if (Math.round(resultado) == resultado) {
                System.out.println("Numero inteiro");
            } else {
                System.out.println("Numero decimal");
            }
        } else {
            System.out.println("Escolha uma operacao valida");
        }

    }
    
}
