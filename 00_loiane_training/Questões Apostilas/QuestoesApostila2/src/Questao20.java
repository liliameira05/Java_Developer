import java.util.Scanner;

public class Questao20 {

    public static void main (String[] arg) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double nota1, nota2, nota3, media;

        System.out.println("Insira as 3 notas do aluno");
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        nota3 = scan.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A media do aluno e " + media);

        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
