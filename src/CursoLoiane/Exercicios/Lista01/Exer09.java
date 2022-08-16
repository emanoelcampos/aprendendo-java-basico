package CursoLoiane.Exercicios.Lista01;

import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é a temperatura em Farenheit? ");
        double tempFare = scan.nextDouble();
        double tempCel = (tempFare - 32) / 1.8;
        System.out.println("A temperatura em Celsius é: " + tempCel);


    }
}
