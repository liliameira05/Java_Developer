import java.util.Scanner;

public class Questao14 {
    
    public static void main (String[] args) {

        // Instancia de leitua
        Scanner scan = new Scanner(System.in);

        // Variaveis a serem lidas
        double peso, multa, excedente = 0;
        int multaKg = 4;

        System.out.println("Quantos quilos foram pescados?");
        peso = scan.nextDouble();

        excedente = peso - 50;
        if(excedente < 0) {
            excedente = 0;
        }

        multa = excedente * multaKg;
        System.out.println("O excedente e " + excedente + " kg. A multa e " + multa + " reais.");
    }
}
