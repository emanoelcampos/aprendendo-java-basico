package CursoLoiane.Exercicios.Lista01;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o tamanho do lado do quadrado? ");
        double lado = scan.nextDouble();
        double area = Math.pow(lado, 2);
        System.out.println("A área do quadrado é: " + area);
        double dobroArea = area * 2;
        System.out.println("O dobro da área desse quadrado é: " +dobroArea);
    }
}
