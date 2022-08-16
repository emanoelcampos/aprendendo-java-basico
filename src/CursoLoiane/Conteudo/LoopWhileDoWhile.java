package CursoLoiane.Conteudo;

import java.util.Locale;
import java.util.Scanner;

public class LoopWhileDoWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        // WHILE = ENQUANTO A EXPRESSÃO FOR TRUE, executa bloco dentro do comando WHILE

        int i = 1; //count ou cont
        int max = 10;

        System.out.println("Contado até "+max);

        while(i<=max){
            System.out.println("Valor de i: "+i);
            i++; //i = i +1; ou i += 1;
        }

        System.out.println(i); //valor de 11

        // DO-WHILE = executa o bloco dentro do comando DO até avaliação ser FALSE

        do {
            i++;
            System.out.println("Valor de i: "+i);
        }while (i<15);
        System.out.println(i);


    }

}


