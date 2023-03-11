import java.util.Scanner;

public class Questao15 {
    
    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis a serem lidas
        double valorHora, horasTrabalhadas, salarioBruto, descontoRenda, descontoINSS, descontoSindicato, salarioLiquido;

        System.out.println("Quantas horas foram trabalhadas?");
        horasTrabalhadas = scan.nextDouble();

        System.out.println("Valor da hora");
        valorHora = scan.nextDouble();

        salarioBruto = horasTrabalhadas*valorHora;
        descontoRenda = salarioBruto * 0.11;
        descontoINSS = salarioBruto * 0.08;
        descontoSindicato = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - descontoRenda - descontoINSS - descontoSindicato;

        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Desconto Imposto de Renda: " + descontoRenda);
        System.out.println("Desconto Sindicato: " + descontoSindicato);
        System.out.println("Salario liquido: " + salarioLiquido);
    }
}
