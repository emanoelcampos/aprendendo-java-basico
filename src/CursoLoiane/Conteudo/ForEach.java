package CursoLoiane.Conteudo;

import java.util.Locale;
import java.util.Scanner;

public class ForEach
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);




        //int[] notas = new int [10];
        //for (int nota : notas){
        // System.out.println(nota);}



        int[] notas = new int[5];

        for(int i = 0; i<notas.length; i++)
        {
            System.out.println("Digite 5 números: ");
            notas[i] = scan.nextInt();
        }

        for (int nota : notas){
        System.out.println(nota);
        }





















    }
}

