import java.util.Scanner;

public class Questao12 {

    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double valorHora, qtdHoras, salarioBruto, descontoIR, descontoINSS, depositoFGTS, totalDesconto, salarioLiquido;
        String porcentagemIR;

        System.out.println("Qual e o valor da hora?");
        valorHora = scan.nextDouble();
        
        System.out.println("Quantas horas foram trabalhadas?");
        qtdHoras = scan.nextDouble();

        salarioBruto = valorHora * qtdHoras;
        if (salarioBruto <= 900){
            descontoIR = 0;
            porcentagemIR = "0%";
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
            porcentagemIR = "5%";
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.10;
            porcentagemIR = "10%";
        } else {
            descontoIR = salarioBruto * 0.20;
            porcentagemIR = "20%";
        }

        descontoINSS = salarioBruto * 0.10;
        depositoFGTS = salarioBruto * 0.11;
        totalDesconto = descontoIR + descontoINSS;
        salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("Salario Bruto: (" + valorHora + " * " + qtdHoras + "): R$ " + salarioBruto);
        System.out.println("(-) IR (" + porcentagemIR + "): R$ " + descontoIR);
        System.out.println("(-) INSS (10%): R$ " + descontoINSS);
        System.out.println("FGTS (11%): R$ " + depositoFGTS);
        System.out.println("Total de descontos: R$ " + totalDesconto);
        System.out.println("Salario Liquido: R$ " + salarioLiquido);
    
    }
    
}
