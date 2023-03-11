import java.util.Scanner;

public class Questao8 {
    
    public static void main(String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis a serem lidas
        double valorHora, horasTrabalhadas, totalValor;

        System.out.println("Quantas horas sao trabalhadas?");
        horasTrabalhadas = scan.nextDouble();
        
        System.out.println("Qual e o valor da hora?");
        valorHora = scan.nextDouble();

        totalValor = horasTrabalhadas * valorHora;

        System.out.println("Salario final: " + totalValor);
    }
}
