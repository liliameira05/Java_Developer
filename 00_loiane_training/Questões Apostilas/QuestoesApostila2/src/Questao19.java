public class Questao19 {
    public static void main (String[] arg) {

        // Variaveis
        int[] vetor_teste = {326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7, 16};
        int centena, dezena, unidade, resto;
        // Loop pelo vetor
        for (int indice = 0; indice < vetor_teste.length; indice++) {
            System.out.println("O numero e " + vetor_teste[indice]);

            centena = vetor_teste[indice] / 100;
            resto = vetor_teste[indice] % 100;
            dezena = resto / 10;
            unidade = resto % 10;

            System.out.println(vetor_teste[indice] + ": " + centena + " centenas, " + dezena + " dezenas, " + unidade + " unidades");
        }

    }
}