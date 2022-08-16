package CursoLoiane.Exercicios.Lista01;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é a temperatura em Celsius? ");
        double tempCel = scan.nextDouble();
        double tempFare = (1.8 * tempCel) + 32;
        System.out.println("A temperatura em Fahrenheit  é: " + tempFare);
    }
}
