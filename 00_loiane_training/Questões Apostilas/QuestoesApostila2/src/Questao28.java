import java.util.Scanner;

public class Questao28 {

    public static void main (String[] arg) {

        try (
            // Instancia de leitura
            Scanner scan = new Scanner(System.in);) {

                // Variaveis
                String tipoCarne, tipoPagamento;
                double qtdCarne, precoTotal = 0;

                // Insercao do usuario
                System.out.println("Qual e o tipo de carne?");
                tipoCarne = scan.nextLine().toLowerCase();

                System.out.println("Qual e o tipo de pagamento?");
                tipoPagamento = scan.nextLine().toLowerCase();

                System.out.println("Quantos quilos?");
                qtdCarne = scan.nextDouble();
                
                // Tratamento
                switch (tipoCarne) {
                    case "file duplo": if (qtdCarne <= 5) {
                        precoTotal = 4.90 * qtdCarne;
                    } else {
                        precoTotal = 5.80 * qtdCarne;
                    }; break;

                    case "alcatra": if (qtdCarne <= 5) {
                        precoTotal = 5.90 * qtdCarne;
                    } else {
                        precoTotal = 6.80 * qtdCarne;
                    }; break;

                    case "picanha": if (qtdCarne <= 5) {
                        precoTotal = 6.90 * qtdCarne;
                    } else {
                        precoTotal = 7.80 * qtdCarne;
                    }; break;

                    default: System.out.println("Opcao nao valida");
                    System.exit(0);
                }

                switch (tipoPagamento) {

                    case "cartao tabajara":
                    System.out.println("Tipo de carne: " + tipoCarne 
                    + "\n Quantidade de carne: " + qtdCarne + " kg"
                    + "\n Preco total: R$ " + precoTotal
                    + "\n Tipo de pagamento: " + tipoPagamento
                    + "\n Desconto: R$ " + (precoTotal * 0.05)
                    + "\n Valor a ser pago: R$ " + (precoTotal * 0.95)); break;

                    default:
                    System.out.println("Tipo de carne: " + tipoCarne 
                    + "\n Quantidade de carne: " + qtdCarne + " kg"
                    + "\n Preco total: R$ " + precoTotal
                    + "\n Tipo de pagamento: " + tipoPagamento
                    + "\n Desconto: R$ 0.0"
                    + "\n Valor a ser pago: R$ " + precoTotal);
                }

            }
    }
    
}
