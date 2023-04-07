import java.util.Scanner;

public class Questao21 {
    public static void main (String[] arg) {
        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        int valor, resto, qtdNota1, qtdNota5, qtdNota10, qtdNota50, qtdNota100;

        System.out.println("Insira o valor a ser sacado");
        valor = scan.nextInt();

        if (valor < 10 || valor > 600) {
            System.out.println("O valor minimo de saque e 10 reais e maximo, 600");
        } else {
            qtdNota100 = valor / 100;
            resto = valor % 100;

            qtdNota50 = resto / 50;
            resto %= 50;

            qtdNota10 = resto / 10;
            resto %= 10;

            qtdNota5 = resto / 5;
            resto %= 5;

            qtdNota1 = resto;

            System.out.println(valor + " sera sacado em " + qtdNota100 + " notas de 100 reais, " + qtdNota50 + " notas de 50 reais, " + qtdNota10 + " notas de 10 reais, " + qtdNota5 + " notas de 5 reais e " + qtdNota1 + " notas de 1 real");
        }

        scan.close();

    }
}
