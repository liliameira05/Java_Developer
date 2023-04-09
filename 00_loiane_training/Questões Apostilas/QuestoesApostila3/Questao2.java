import java.util.Scanner;

public class Questao2 {
    
    public static void main (String[] arg) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        String nome, senha;

        do {
            System.out.println("Insira o nome de usuario");
            nome = scan.nextLine().toLowerCase();

            System.out.println("Insira a senha");
            senha = scan.nextLine().toLowerCase();

            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("Senha e nome de usuarios nao podem ser iguais");
            }

        } while (nome.equalsIgnoreCase(senha));

        scan.close();
        
    }
}
