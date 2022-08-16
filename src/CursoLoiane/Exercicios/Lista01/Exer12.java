package CursoLoiane.Exercicios.Lista01;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual sua altura? ");
        double altura = scan.nextDouble();
        double pesoIdeal = (72.7*altura)-58;
        System.out.println("Seu peso ideal é: " +pesoIdeal);
    }
}
