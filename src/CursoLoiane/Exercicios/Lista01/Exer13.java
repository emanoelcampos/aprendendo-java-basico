package CursoLoiane.Exercicios.Lista01;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do funcionário: ");
        String funcionario = scan.next();
        System.out.println("Quantos reais " + funcionario + " ganha por hora trabalhada?");
        double reaisPorHora = scan.nextDouble();
        System.out.println("Quantas horas " + funcionario + " trabalhou esse mês?");
        double horasTrabalhadas = scan.nextDouble();
        double salarioBrutoPorHoraTrabalhada = reaisPorHora * horasTrabalhadas;
        System.out.println("O funcionário " + funcionario + " ganhou R$" +salarioBrutoPorHoraTrabalhada+ " reais de salário bruto esse mês.");
        double descontoInss = (salarioBrutoPorHoraTrabalhada * 0.08);
        System.out.println("O funcionário "+funcionario+" pagou R$" +descontoInss+ " reais ao INSS.");
        double sindicato = (salarioBrutoPorHoraTrabalhada * 0.05);
        System.out.println("O funcionário "+funcionario+" pagou R$" +sindicato+ " reais ao sindicato.");
        double impostoDeRenda = (salarioBrutoPorHoraTrabalhada * 0.11);
        double salarioLiquido = salarioBrutoPorHoraTrabalhada - (impostoDeRenda + descontoInss + sindicato);
        System.out.println("O funcionário "+funcionario+" ganhou R$" +salarioLiquido+ " reais de salário líquido esse mês.");

    }
}
