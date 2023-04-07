import java.util.Scanner;

public class Questap18 {

    public static void main (String[] arg) {
        
        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        int dia, mes, ano;

        System.out.println("Insira o dia");
        dia = scan.nextInt();

        System.out.println("Insira o mes");
        mes = scan.nextInt();

        System.out.println("Insira o ano");
        ano = scan.nextInt();

        if ((dia > 31 || dia <= 0) || (mes > 12 || mes <= 0) || (ano < 0)) {
            System.out.println("Data nao e valida");
        } else if (mes == 2 && ano % 4 == 0 && dia > 29) {
            System.out.println("Data nao e valida");
        } else if (mes == 2 && ano % 4 != 0 && dia > 28) {
            System.out.println("Data nao e valida");
        } else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("Data nao e valida");
        } else {
            System.out.println("Data e valida: " + dia + "/" + mes + "/" + ano);
        }

        scan.close();
    }
    
}
