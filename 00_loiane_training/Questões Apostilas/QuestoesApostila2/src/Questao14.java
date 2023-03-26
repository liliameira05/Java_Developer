import java.util.Scanner;

public class Questao14 {
    public static void main (String[] args) {
        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double nota1, nota2, media;

        System.out.println("Insira as duas notas");
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        media = (nota1 + nota2) / 2;

        System.out.println("Notas: " + nota1 + " e " + nota2);
        System.out.println("Media final: " + media);
        if (media >= 9) {
            System.out.println("Conceito: A - APROVADO");
        } else if (media < 9 && media >= 7.5) {
            System.out.println("Conceito: B - APROVADO");
        } else if (media < 7.5 && media >= 6) {
            System.out.println("Conceito: C - APROVADO");
        } else if (media > 6 && media >= 4) {
            System.out.println("Conceito: D - REAPROVADO");
        } else {
            System.out.println("Conceito: E - REAPROVADO");
        }
    }
}
