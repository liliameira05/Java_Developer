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
            System.out.println("Preco da venda de álcool: R$ " + numeroLitros * 1.9);
        } else if (tipoCombustivel.equals("g")) {
            System.out.println("Preco da venda de gasolina: R$ " + numeroLitros * 2.5);
        } else {
            System.out.println("Opcao de combustivel nao valida");
        }
    }
    
}
