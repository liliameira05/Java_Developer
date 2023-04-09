import java.util.Scanner;

public class Questao3 {
    
    public static void main (String[] arg) {

        // Instancia de leitua
        Scanner scan = new Scanner(System.in);
        
        // Criacao de variaveis
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        boolean infoValida = false;

        do {
            System.out.println("Insira o nome");
            nome = scan.next().toLowerCase();

            if(nome.length() <= 3) {
                System.out.println("O nome deve ter mais de 3 letras");
            } else {
                infoValida = true;
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Insira a idade");
            idade = scan.nextInt();

            if(idade <= 150 && idade >= 0) {
                infoValida = true;
            } else {
                System.out.println("A idade deve ser um numero entre 0 e 150");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Insira o salario");
            salario = scan.nextDouble();

            if(salario > 0) {
                infoValida = true;
            } else {
                System.out.println("O salario deve ser maior que zero");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Insira o sexo");
            sexo = scan.next();

            if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
                infoValida = true;
            } else {
                System.out.println("O sexo deve ser masculino (M) ou feminino (F)");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Insira o estado civil");
            estadoCivil = scan.next();

            if(estadoCivil.equalsIgnoreCase("s") || 
            estadoCivil.equalsIgnoreCase("c") || 
            estadoCivil.equalsIgnoreCase("v") || 
            estadoCivil.equalsIgnoreCase("d")) {
                infoValida = true;
            } else {
                System.out.println("O estado civil deve ser solteiro (S), " +
                "casado (C), viuvo (V) ou divorciado (D)");
            }
        } while (!infoValida);

        System.out.println("Nome do usuario: " + nome
        + "\nIdade: " + idade
        + "\nSalario: R$ " + salario
        + "\nSexo: " + sexo
        + "\nEstado Civil: " + estadoCivil);

        scan.close();
    }
}
