import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        // Instancia 
        Scanner scan = new Scanner(System.in);

        // Variavel a ser lida
        double qtdMetros;

        System.out.println("Quantos metros sao?");
        qtdMetros = scan.nextDouble();

        System.out.println("A equivalencia em cm: " + (qtdMetros * 100));
        
    }
    
}
