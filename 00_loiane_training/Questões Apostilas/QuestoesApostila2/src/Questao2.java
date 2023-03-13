import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

    // Instancia de leitura
    Scanner scan = new Scanner(System.in);

    // Variaveis
    double numero;

    System.out.println("Insira o primeiro numero");
    numero = scan.nextDouble();

    if (numero >= 0) {
        System.out.println("O numero " + numero + " e positivo");
    } else {
        System.out.println("O numero " + numero + " e negativo");
    }
        
    }
}
