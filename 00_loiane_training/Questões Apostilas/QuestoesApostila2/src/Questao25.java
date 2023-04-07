import java.util.Scanner;

public class Questao25 {

    public static void main (String[] arg) {
        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        String resposta;
        int numeroSim = 0;

        System.out.println("Telefonou para a vítima?");
        resposta = scan.next().toLowerCase();
        if (resposta.equals("sim")) {
            numeroSim += 1;
        }

        System.out.println("Esteve no local do crime?");
        resposta = scan.next().toLowerCase();
        if (resposta.equals("sim")) {
            numeroSim += 1;
        }

        System.out.println("Mora perto da vítima?");
        resposta = scan.next().toLowerCase();
        if (resposta.equals("sim")) {
            numeroSim += 1;
        }

        System.out.println("Devia para a vítima?");
        resposta = scan.next().toLowerCase();
        if (resposta.equals("sim")) {
            numeroSim += 1;
        }

        System.out.println("Já trabalhou com a vítima?");
        resposta = scan.next().toLowerCase();
        if (resposta.equals("sim")) {
            numeroSim += 1;
        }

        System.out.println(numeroSim);

        switch (numeroSim) {

            case 2: System.out.println("Suspeito"); break;
            case 3: System.out.println("Cúmplice"); break;
            case 4: System.out.println("Cúmplice"); break;
            case 5: System.out.println("Assassino"); break;
            default: System.out.println("Inocente");
        }

        scan.close();        

    }
    
}
