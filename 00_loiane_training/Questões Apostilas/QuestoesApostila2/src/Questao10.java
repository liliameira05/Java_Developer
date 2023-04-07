import java.util.Scanner;

public class Questao10 {

    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        String entradaTeclado;
        char turno;

        System.out.println("Em que turno voce estuda? M (matutino), V (vespetino) ou N (noturno)?");
        entradaTeclado = scan.next().toLowerCase();
        turno = entradaTeclado.charAt(0);

        // Pode aceitar mais de uma letra, mas analisa apenas a primeira para dar a resposta

        switch(turno){
            case 'm': System.out.println("Matutino"); break;
            case 'v': System.out.println("Vespertino"); break;
            case 'n': System.out.println("Noturno"); break;
            default: System.out.println("Valor invalido");
        }

        scan.close();
    }    
}
