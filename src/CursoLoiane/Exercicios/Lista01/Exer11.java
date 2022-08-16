package CursoLoiane.Exercicios.Lista01;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro número deve ser INTEIRO: ");
        int numero1 = scan.nextInt();

        System.out.println("Segundo número deve ser INTEIRO: ");
        int numero2 = scan.nextInt();

        System.out.println("Terceiro número deve ser REAL");
        double numero3 = scan.nextDouble();

        double calculo1 = ((2*numero1)*numero2/2);
        System.out.println("O resultado do calculo 1 é: " +calculo1);

        double calculo2 = (3*numero1)+numero3;
        System.out.println("O resultado do calculo 2 é: " +calculo2);

        double calculo3 = Math.pow(numero3, 3);
        System.out.println("O resultado do calculo 3 é: " +calculo3);
    }
}
