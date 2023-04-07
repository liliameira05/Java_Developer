import java.util.Scanner;

public class Questao26 {

    public static void main (String[] arg) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double numeroLitros;
        String tipoCombustivel;

        System.out.println("Numero de litros vendidos");
        numeroLitros = scan.nextDouble();

        System.out.println("Tipo de combustivel usado");
        tipoCombustivel = scan.next().toLowerCase();

        if (tipoCombustivel.equals("a")) {
            if (numeroLitros <= 20) {
                System.out.println("Preco da venda de álcool: R$ " + numeroLitros * 1.9 * 0.97); // Desconto 3%
            } else {
                System.out.println("Preco da venda de álcool: R$ " + numeroLitros * 1.9 * 0.95); // Desconto 5%
            }
        } else if (tipoCombustivel.equals("g")) {
            if (numeroLitros <= 20) {
                System.out.println("Preco da venda de álcool: R$ " + numeroLitros * 2.5 * 0.96); // Desconto 4%
            } else {
                System.out.println("Preco da venda de álcool: R$ " + numeroLitros * 2.5 * 0.94); // Desconto 6%
            }
        } else {
            System.out.println("Opcao de combustivel nao valida");
        }

        scan.close();
        
    }
    
}
