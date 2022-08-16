package CursoLoiane.Exercicios.Lista01;

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do funcionário: ");
        String funcionario = scan.next();
        System.out.println("Quantos reais " + funcionario + " ganha por hora trabalhada?");
        double reaisPorHora = scan.nextDouble();
        System.out.println("Quantas horas " + funcionario + " trabalhou esse mês?");
        double horasTrabalhadas = scan.nextDouble();
        double salarioPorHoraTrabalhada = reaisPorHora * horasTrabalhadas;
        System.out.println("O funcionário " + funcionario + " ganhou R$" +salarioPorHoraTrabalhada+ " reais esse mês.");
    }
}
