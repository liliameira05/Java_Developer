import java.util.Scanner;

public class Questao11 {

    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double salarioAtual, aumento, salarioNovo;
        String percentualAumento;

        System.out.println("Qual e o salario do colaborador?");
        salarioAtual = scan.nextDouble();


        if (salarioAtual <= 0) {
            System.out.println("Valor de salario negativo ou nulo. Salario nao valido");
        } else {
            if (salarioAtual <= 280) {
                percentualAumento = "20%";
                aumento = salarioAtual * 0.20;
                salarioNovo = salarioAtual + aumento;
            } else if (salarioAtual > 280 && salarioAtual <= 700) {
                percentualAumento = "15%";
                aumento = salarioAtual * 0.15;
                salarioNovo = salarioAtual + aumento;
            } else if (salarioAtual > 700 && salarioAtual <= 1500) {
                percentualAumento = "10%";
                aumento = salarioAtual * 0.10;
                salarioNovo = salarioAtual + aumento;
            } else {
                percentualAumento = "5%";
                aumento = salarioAtual * 0.05;
                salarioNovo = salarioAtual + aumento;
            }

            System.out.println("Salario atual e R$ " + salarioAtual);
            System.out.println("Percentual de aumento e " + percentualAumento);
            System.out.println("Aumento e R$ " + aumento);
            System.out.println("Novo salario e R$ " + salarioNovo);
        
            scan.close();
        
        }
    }
    
}
