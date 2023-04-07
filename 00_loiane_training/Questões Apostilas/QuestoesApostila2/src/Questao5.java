import java.util.Scanner;

public class Questao5 {
    
    public static void main(String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double nota1, nota2, media;

        System.out.println("Insira as duas notas");
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;
        
        if (media == 10) {
            System.out.println("Media: " + media + " Aprovado com Distincao");
        } else if (media >= 7) {
            System.out.println("Media: " + media + " Aprovado");
        } else {
            System.out.println("Media: " + media + " Reprovado");
        }
        
        scan.close();
    }
}
