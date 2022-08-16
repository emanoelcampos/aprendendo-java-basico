package CursoLoiane.Exercicios.Lista01;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("A soma dos dois números é: " +resultado);
    }
}
