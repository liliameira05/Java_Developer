public class Questao30 {

    public static void main (String[] args) {
        System.out.println("Preço do pão: R$ 0.18");
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        for (int eachProduct = 1; eachProduct <= 50; eachProduct++) {
            System.out.println(eachProduct + " - R$ " + eachProduct * 0.18);
        }
    }

}