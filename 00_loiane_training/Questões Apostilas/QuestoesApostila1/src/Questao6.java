import java.util.Scanner;


public class Questao6 {
    
    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Leitura de variaveis
        double raio;
        double areaCirculo;
        
        System.out.println("Qual e o raio?");
        raio = scan.nextDouble();

        areaCirculo = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do circulo e " + areaCirculo);

    }
}
