import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        char letra;
        String entradaTeclado;

        System.out.println("Insira uma letra");
        entradaTeclado = scan.next().toLowerCase();
        letra = entradaTeclado.charAt(0); // https://www.geeksforgeeks.org/gfact-51-java-scanner-nextchar/

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A primeira letra de " + entradaTeclado + " e vogal");
        } else {
            System.out.println("A primeira letra de " + entradaTeclado + " e consoante");
        }
        
    }
    
}
