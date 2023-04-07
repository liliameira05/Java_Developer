import java.util.Scanner;

public class Questao13 {
    
    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);
        
        // Variaveis
        int numeroDia;

        System.out.println("Insira um numero equivalente a um dia da semana (1-Domingo, 2- Segunda, etc.)");
        // https://www.geeksforgeeks.org/gfact-51-java-scanner-nextchar/
        numeroDia = scan.nextInt();

        switch(numeroDia){
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terca"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sabado"); break;
            default: System.out.println("Valor invalido");
        }

        scan.close();
        
    }
}
