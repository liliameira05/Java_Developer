import java.util.Scanner;

public class Questao2 {
    
    public static void main (String[] args) {

        // Instacia de leitura
        Scanner scan = new Scanner(System.in);

        // Variavel a ser lida
        double numero;
        
        // Ler um numero
        System.out.println("Insira um numero, por favor");
        numero = scan.nextDouble();

        System.out.println("O numero informado e " + numero);
    }

}
