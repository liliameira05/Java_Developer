import java.util.Scanner;

public class Questao16 {
    
    public static void main(String[] args) {
        
        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double area, precoTotal, qtdLitros, qtdLatas;
        int areaPorLitro = 3, litrosPorLata = 18, precoLata = 80;

        System.out.println("Qual e o tamanho da area a ser pintada (m²)?");
        area = scan.nextDouble();

        qtdLitros = (area / areaPorLitro);
        qtdLatas = qtdLitros / litrosPorLata;
        
        if (qtdLitros % litrosPorLata != 0) {
            qtdLitros -= qtdLitros % litrosPorLata;
            qtdLatas = qtdLitros / litrosPorLata + 1;
        }

        precoTotal = qtdLatas * precoLata;

        System.out.println("Quantidade de latas: " + qtdLatas + ". Preço: R$ " + precoTotal);
    }
}
