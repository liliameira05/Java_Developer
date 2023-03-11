import java.util.Scanner;

public class Questao18 {

    public static void main (String[] args) {

        // Instancia de leitura
        Scanner scan = new Scanner(System.in);

        // Variaveis
        double tamanhoArquivo, velocidadeDownload, tempoDownload;

        System.out.println("Qual e o tamanho do arquivo (MB)?");
        tamanhoArquivo = scan.nextDouble();

        System.out.println("Qual e a velocidade de download (MBps)?");
        velocidadeDownload = scan.nextDouble();

        tempoDownload = (tamanhoArquivo / velocidadeDownload) / 60;

        System.out.println("O download sera finalizado em " + tempoDownload + " minutos");        
    }
    
}
