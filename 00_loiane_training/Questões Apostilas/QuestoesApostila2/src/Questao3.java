import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        String sexo;

        System.out.println("Escreva o sexo (F = Feminino e M = Masculino)");
        sexo = scan.next();
        sexo = sexo.toLowerCase();

        switch(sexo){

            case "f": System.out.println("O sexo e feminino"); break;
            case "m": System.out.println("O sexo e masculino"); break;
            default: System.out.println("Sexo invalido");
        }

        scan.close();
    }
    
}
