import java.util.Scanner;

public class LojaTinta {

    public static void main (String[] args) {

        // --------- Declarações de variáveis

        // Variável a ser lida
        Scanner scan = new Scanner(System.in);
        double qtdMetros;
        double litrosTinta;

        // Qtd de litros por unidade
        double litrosLata = 18;
        double litrosGalao = 3.6;

        // Variaveis a serem consideradas no cálculo
        // Valores por unidade
        int precoLata = 80;
        int precoGalao = 25;

        // Preços dos pedidos
        double valorLatas;
        double valorGaloes;
        double valorMix;

        // Qtd de unidades
        double qtdLata;
        double qtdGalao;
        double restoMix = 0;

        // Folga
        double folgaTinta = 1.1;

        // Início de fato
        System.out.println("Bem vindo ao programa de orçamentos de tintas!");
        System.out.println("Quantos metros?");

        qtdMetros = scan.nextDouble();
        litrosTinta = (qtdMetros / 6) * folgaTinta; // Cada litro d tinta dá 6 metros

        // Situacao 1
        qtdLata = litrosTinta / litrosLata;
        if (litrosTinta % litrosLata != 0){
            qtdLata = (litrosTinta - litrosTinta % litrosLata) / litrosLata + 1;
        }
        valorLatas = qtdLata * precoLata;

        System.out.println("Quantidade de latas necessárias: " + qtdLata);
        System.out.println("Valor para a quantidade de latas: " + valorLatas);

        // Situacao 2
        qtdGalao = litrosTinta / litrosGalao;
        if (litrosTinta % litrosGalao != 0){
            qtdGalao = (litrosTinta - litrosTinta % litrosGalao)  / litrosGalao + 1;
        }
        valorGaloes = qtdGalao * precoGalao;

        System.out.println("Quantidade de galões necessários: " + qtdGalao);
        System.out.println("Valor para a quantidade de galões: " + valorGaloes);

        // Situacao 3
        qtdLata = litrosTinta / litrosLata;

        if (litrosTinta % litrosLata != 0){
            qtdLata = (litrosTinta - litrosTinta % litrosLata) / litrosLata;
            restoMix = litrosTinta % litrosLata;
        }
        valorLatas = qtdLata * precoLata;

        qtdGalao = restoMix / litrosGalao;
        if (restoMix % litrosGalao != 0){
            qtdGalao = (restoMix - restoMix % litrosGalao)  / litrosGalao + 1;
        }
        valorGaloes = qtdGalao * precoGalao;

        valorMix = valorLatas + valorGaloes;

        System.out.println("Quantidade de latas necessárias: " + qtdLata + ". Quantidade de galões necessários: " + qtdGalao);
        System.out.println("Valor do mix: " + valorMix);
        
    }
    
}
