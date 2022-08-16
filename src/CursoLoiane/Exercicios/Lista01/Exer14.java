package CursoLoiane.Exercicios.Lista01;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tamanho do arquivo para download em MB? ");
        double arquivoMb = scan.nextDouble();
        System.out.println("Qual a velocidade da sua internet em Mbps? ");
        double velocidadeInternet = scan.nextFloat();
        double tempoDownload = arquivoMb/(velocidadeInternet/8);
        double tempoMinutos = tempoDownload/60;
        System.out.println("O tempo de download do arquivo em minutos será de "+tempoMinutos);
    }
}
