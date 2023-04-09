import java.util.Scanner;

public class Questao1 {

    public static void main (String[] arg) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Criacao de variaveis
        double nota;

        System.out.println("Insira a nota no sistema");
        nota = scan.nextDouble();

        while (!(nota >= 0 && nota <=10)) {
            System.out.println("Nota invalida. \nInsira uma nota valida entre 0 e 10");
            nota = scan.nextDouble();
        } 

        scan.close();
        
    }
}
