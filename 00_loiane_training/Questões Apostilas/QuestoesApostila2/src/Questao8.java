import java.util.Scanner;

public class Questao8 {
    
    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double preco1, preco2, preco3, menorPreco;
        String produto;

        System.out.println("Insira os precos dos tres produtos");
        preco1 = scan.nextDouble();
        preco2 = scan.nextDouble();
        preco3 = scan.nextDouble();

        menorPreco = preco1;
        produto = "1º produto";

        if (menorPreco > preco2) {
            menorPreco = preco2;
            produto = "2º produto";
        }
        if (menorPreco > preco3) {
            menorPreco = preco3;
            produto = "3º produto";
        }

        System.out.println("Compre o " + produto + " de preco " + menorPreco);

        scan.close();
        
    }
}
