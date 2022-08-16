package CursoLoiane.Exercicios.Lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);


        /*//1
        System.out.println("Digite o primeiro número:");
        double numero1 = scan.nextDouble();
        System.out.println("Digite o segundo número");
        double numero2 = scan.nextDouble();

        if (numero1 > numero2)
        {
            System.out.println("O maior número é: " +numero1);
        }
            else
            {
                System.out.println("O maior número é: " +numero2);
            }


       //2
        System.out.println("Digite um número:");
        double numero = scan.nextDouble();

        if (numero >= 0)
        {
            System.out.println("O número " + numero + " é positivo.");
        }

        else
        {
            System.out.println("O número " + numero + " é negativo.");
        }

        //3
        System.out.println("Digite seu sexo (M / F)");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("f"))
        {
            System.out.println("F - feminino");
        } else if (sexo.equalsIgnoreCase("m")) {
            System.out.println("M - masculino");
        } else {
            System.out.println("Sexo inválido");
        }

        //4
        System.out.println("Digite a letra: ");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) {
            System.out.println("vogal");
        }
            else{
                System.out.println("consoante");
            }

            //EXERCÍCIO 04 -> Switch com validação de número de caracteres:

            if (letra.length() > 1){
                System.out.println("Não é uma letra válida");
            } else{
            switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("Vogal."); break;
            default:System.out.println("Consoante.");
            }
            }

        //5
        System.out.println("Digite primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite segunda nota");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2)/2;

        if(media == 10)
        {
        System.out.println("APROVADO COM DISTINÇÃO!");
        }
        else if (media >= 7)
        {
            System.out.println("APROVADO!");
        }
        else
        {
            System.out.println("REPROVADO");
        }

        //6
        System.out.println("Digite primeiro numero: ");
        double numero1 = scan.nextDouble();
        System.out.println("Digite segundo numero: ");
        double numero2 = scan.nextDouble();
        System.out.println("Digite terceiro numero: ");
        double numero3 = scan.nextDouble();

        if (numero1 >= numero2 && numero1 >= numero3)
        {
            System.out.println("O maior número é: " + numero1);
        }
        else if(numero2 >= numero1 && numero2 >= numero3)
        {
            System.out.println("O maior número é: " + numero2);
        }
        else{
            System.out.println("O maior número é: " + numero3);
        }

        //7
        System.out.println("Digite primeiro numero: ");
        double numero1 = scan.nextDouble();
        System.out.println("Digite segundo numero: ");
        double numero2 = scan.nextDouble();
        System.out.println("Digite terceiro numero: ");
        double numero3 = scan.nextDouble();
        if (numero1 > numero2 && numero1 > numero3)
        {
            System.out.println("O maior número é: " + numero1);
        }
        else if(numero2 > numero1 && numero2 > numero3)
        {
            System.out.println("O maior número é: " + numero2);
        }
        else{
            System.out.println("O maior número é: " + numero3);
        }

        if (numero1 <= numero2 && numero1 <= numero3)
        {
            System.out.println("O menor número é: " + numero1);
        }
        else if(numero2 <= numero1 && numero2 <= numero3)
        {
            System.out.println("O menor número é: " + numero2);
        }
        else{
            System.out.println("O menor número é: " + numero3);
        }

        //8
        System.out.println("Qual o pre?o do primeiro produto? ");
        double preco1 = scan.nextDouble();
        System.out.println("Qual o pre?o do segundo produto? ");
        double preco2 = scan.nextDouble();
        System.out.println("Qual o pre?o do terceiro produto? ");
        double preco3 = scan.nextDouble();

        if(preco1 <= preco2 && preco1 <= preco3)
        {
            System.out.println("O primeiro produto é o mais barato, compre!");
        }
        else if(preco2 <= preco1 && preco2 <= preco3)
        {
            System.out.println("O segundo produto é o mais barato, compre!");
        }
        else
        {
            System.out.println("O terceiro produto é o mais barato, compre!");
        }

        //9
        System.out.println("Digite primeiro numero: ");
        double numero1 = scan.nextDouble();
        System.out.println("Digite segundo numero: ");
        double numero2 = scan.nextDouble();
        System.out.println("Digite terceiro numero: ");
        double numero3 = scan.nextDouble();

        if (numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3){
            //num1 é menor
            //num3 é maior
            //n1<n2<n3
            System.out.println(numero3 + " - " + numero2 + " - " + numero1);

        } else if(numero1 <= numero2 && numero1 <= numero3 && numero3 <= numero2){
            //num1 é menor
            //num2 é maior
            //n1<n3<n2
            System.out.println(numero2 + " - " + numero3 + " - " + numero1);

        } else if(numero2 <= numero1 && numero2 <= numero3 && numero1 <= numero3) {
            //num2 é menor
            //num3 é maior
            //n2<n1<n3
            System.out.println(numero3 + " - " + numero1 + " - " + numero2);
        }

        else if(numero2 <= numero1 && numero2 <= numero3 && numero3 <= numero1) {
            //num2 é menor
            //num1 é maior
            //n2<n3<n1
            System.out.println(numero1 + " - " + numero3 + " - " + numero2);
        }

        else if(numero3 <= numero1 && numero3 <= numero2 && numero1 <= numero2) {
            //num3 é menor
            //num2 é maior
            //n3<n1<n2
            System.out.println(numero2 + " - " + numero1 + " - " + numero3);
        }

        else if(numero3 <= numero1 && numero3 <= numero2 && numero2 <= numero1) {
            //num3 é menor
            //num1 é maior
            //n3<n2<n1
            System.out.println(numero2 + " - " + numero2 + " - " + numero1);
        }


        //10
        System.out.println("Em qual turno voc? estuda? (M / V / N)");
        String turno = scan.next();

        switch (turno) {
            case "m":
            case "M":
                System.out.println("Bom dia!"); break;
            case "v":
            case "V":
                System.out.println("Boa Tarde!"); break;
            case "n":
            case "N":
                System.out.println("Boa noite!"); break;
            default:
                System.out.println("Valor Inv?lido");
        }

        //11
        System.out.println("Qual salário do colaborador?");
        double salario = scan.nextDouble();
        double novoSalario;
        double valorAumento;


        if(salario <= 280)
        {
            novoSalario = (salario*0.20) + salario;
            System.out.println("Salário antes do reajuste: R$"+salario);
            System.out.println("Percentual de aumento aplicado de: 20%");
            System.out.println("Valor do aumento: R$"+(salario*0.20));
            System.out.println("Novo salário: R$"+novoSalario);
        }

        else if(salario > 280 && salario <= 700)
        {
            novoSalario = (salario*0.15) + salario;
            System.out.println("salário antes do reajuste: R$"+salario);
            System.out.println("Percentual de aumento aplicado de: 15%");
            System.out.println("Valor do aumento: R$"+(salario*0.15));
            System.out.println("Novo salário: R$"+novoSalario);
        }

        else if(salario > 700 && salario <= 1500)
        {
            novoSalario = (salario*0.10) + salario;
            System.out.println("salário antes do reajuste: R$"+salario);
            System.out.println("Percentual de aumento aplicado de: 10%");
            System.out.println("Valor do aumento: R$"+(salario*0.10));
            System.out.println("Novo salário: R$"+novoSalario);
        }

        else
        {
            novoSalario = (salario*0.05) + salario;
            System.out.println("salário antes do reajuste: R$"+salario);
            System.out.println("Percentual de aumento aplicado de: 5%");
            System.out.println("Valor do aumento: R$"+(salario*0.05));
            System.out.println("Novo salário: R$"+novoSalario);
        }

        // ALTERNATIVA EXERCÍCIO 011:

        System.out.println("Qual salário do colaborador?");
        double salario = scan.nextDouble();

        int percentual = 0;
        if(salario <= 280){
            percentual = 20;
        }else if(salario > 280 && salario < 700){
            percentual = 15;
        } else if(salario >= 700 && salario < 1500){
            percentual = 10;
        }else if(salario >= 1500){
            percentual = 5;
        }

        double aumento = (salario/100 * percentual);
        double salarioAjustado = salario + aumento;

        System.out.println("Salário "+salario);
        System.out.println("Percentual "+percentual);
        System.out.println("Valor do aumento: R$"+aumento);
        System.out.println("Novo salário: R$"+salarioAjustado);


        //12
        System.out.println("Entre com o valor hora:");
        double valorHora = scan.nextDouble();
        System.out.println("Entre com a quantidade de horas trabalhadas:");
        double qtdHoras = scan.nextDouble();

        double salarioBruto = valorHora * qtdHoras;

        int percentualIR = 0;
        if (salarioBruto <= 900){
            percentualIR = 0;
        }else if(salarioBruto > 900 && salarioBruto <= 1500){
            percentualIR = 5;
        }else if(salarioBruto > 1500 && salarioBruto <= 2500){
            percentualIR = 10;
        } else if (salarioBruto > 2500){
            percentualIR = 20;
        }

        double ir = (salarioBruto/100)*percentualIR;
        double inss = (salarioBruto/100)* 10;
        double fgts = (salarioBruto/100)* 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário bruto: (" +valorHora+ " * "+qtdHoras+ "): "+salarioBruto);
        System.out.println("(-) IR ("+percentualIR+"%): "+ir);
        System.out.println("(-) INSS (10%): "+inss);
        System.out.println("FGTS (11%) : "+fgts);
        System.out.println("Total de descontos: "+totalDescontos);
        System.out.println("Salário líquido: "+salarioLiquido);


        //13
        System.out.println("Digite um dia da semana: ");
        int diaSemana = scan.nextInt();
        switch(diaSemana)
        {
            case 1:
                System.out.println("Domingo"); break;
            case 2:
                System.out.println("Segunda"); break;
            case 3:
                System.out.println("Terça"); break;
            case 4:
                System.out.println("Quarta"); break;
            case 5:
                System.out.println("Quinta"); break;
            case 6:
                System.out.println("Sexta"); break;
            case 7:
                System.out.println("Sábado"); break;
            default:
                System.out.println("Não é um dia da semana válido.");
        }

        //14
        System.out.println("Digite primeira nota:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite segunda nota:");
        double nota2 = scan.nextDouble();
        double media = (nota1+nota2)/2;

        if(media >= 9)
        {
            System.out.println("As notas do aluno são: "+nota1+ " e "+nota2);
            System.out.println("APROVADO com "+media+" e conceito A");
        }

        else if(media >=7.5)
        {
            System.out.println("As notas do aluno são: "+nota1+ " e "+nota2);
            System.out.println("APROVADO com "+media+" e conceito B");
        }

        else if(media >= 6)
        {
            System.out.println("As notas do aluno são: "+nota1+ " e "+nota2);
            System.out.println("APROVADO com "+media+" e conceito C");
        }

        else if(media >= 4)
        {
            System.out.println("As notas do aluno são: "+nota1+ " e "+nota2);
            System.out.println("REPROVADO com "+media+" e conceito D");
        }

        else
        {
            System.out.println("As notas do aluno são: "+nota1+ " e "+nota2);
            System.out.println("REPROVADO com "+media+" e conceito E");
        }

        // ALTERNATIVA EXERCÍCIO 014:

        System.out.println("Digite primeira nota:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite segunda nota:");
        double nota2 = scan.nextDouble();
        double media = (nota1+nota2)/2;

        String aproveitamento = "";
        if(media >= 9 && media <= 10){
            aproveitamento = "A";
        } else if(media >=7.5 && media <9){
            aproveitamento = "B";
        } else if(media >= 6 && media < 7.5){
            aproveitamento = "C";
        } else if(media >= 4 && media < 6){
            aproveitamento = "D";
        } else if(media >= 0 && media < 4){
            aproveitamento = "E";
        }

        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.println("Média: "+media);
        System.out.println("Conceito: "+aproveitamento);

        switch (aproveitamento){
            case "A":
            case "B":
            case "C":
                System.out.println("APROVADO"); break;
            case "D":
            case "E":
                System.out.println("REPROVADO"); break;
        }



        //15
        System.out.println("Digite medida primeiro lado:");
        double lado1 = scan.nextDouble();
        System.out.println("Digite medida segundo lado:");
        double lado2 = scan.nextDouble();
        System.out.println("Digite medida terceiro lado:");
        double lado3 = scan.nextDouble();

        if (lado1 == lado2 && lado2 == lado3)
        {
            System.out.println("Triângulo Equilátero");
        }

        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
        {
            System.out.println("Triângulo Isósceles");
        }

        else if (lado1 > lado2 + lado3 || lado2 > lado1 + lado3 || lado3 > lado1 + lado2)
        {
            System.out.println("Não forma triângulo");
        }

        else
        {
            System.out.println("Triângulo Escaleno");
        }


        //16
        System.out.println("Informe valor de a:");
        int valorA = scan.nextInt();
        if(valorA == 0)
        {
            System.out.println("Não é equação do segundo grau!");
        }
        else {
            System.out.println("Informe valor de b:");
            int valorB = scan.nextInt();
            System.out.println("Informe valor de c:");
            int valorC = scan.nextInt();

            double delta = (valorB * valorB) - (4 * valorA * valorC);

            if (delta < 0) {
                System.out.println("Delta negativo");
            } else {

                System.out.println("Delta: "+delta);

                double x1 = ((-valorB) + Math.sqrt(delta)) / (2 * valorA);
                double x2 = ((-valorB) - Math.sqrt(delta)) / (2 * valorA);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        //17
        System.out.println("Qual ano?");
        int ano = scan.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("É bissexto");
        }else{
            System.out.println("Não é bissexto");
        }


        //18
        System.out.println("Número:");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("É par!");
        } else{
            System.out.println("É ímpar!");
        }


        //19
        System.out.println("Primeiro número:");
        double num1 = scan.nextDouble();
        System.out.println("Segundo número:");
        double num2 = scan.nextDouble();

        System.out.println("Qual operação (+ - / *)");
        String operacao = scan.next();
        double resultado = 0;
        boolean valida = true;

        switch (operacao){
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/": resultado = num1 / num2; break;
            default:
                System.out.println("Operação inválida!");
                valida = false;
        }

        if (valida){
            System.out.println("Resultado: "+resultado);

            if (resultado >= 0){
                System.out.println("Resultado positivo");
            } else{
                System.out.println("Resultado negativo");
            }

            if (resultado % 2 == 0){
                System.out.println("Resultado PAR");
            }else{
                System.out.println("Resultado ÍMPAR");
            }
        }



        //20
        System.out.println("Telefonou para vítima?");
        String resp1 = scan.next();
        System.out.println("Esteve no local do crime?");
        String resp2 = scan.next();
        System.out.println("Mora perto da vítima?");
        String resp3 = scan.next();
        System.out.println("Devía para vítima?");
        String resp4 = scan.next();
        System.out.println("Já trabalhou com a vítima?");
        String resp5 = scan.next();

        int contador = 0;

        if (resp1.equalsIgnoreCase("S")){
            contador++;
        }  if (resp2.equalsIgnoreCase("S")){
            contador++;
        }  if (resp3.equalsIgnoreCase("S")){
        contador++;
        }  if (resp4.equalsIgnoreCase("S")){
        contador++;
        } if (resp5.equalsIgnoreCase("S")){
            contador++;
        }


        if (contador == 2){
            System.out.println("SUSPEITA");
        } else if (contador == 3 || contador == 4){
            System.out.println("CÚMPLICE");
        } else if (contador == 5){
            System.out.println("ASSASSINO");
        } else if (contador == 0){
            System.out.println("INOCENTE");
        }


        //21
         System.out.println("Quantidade de litros vendidos:");
        double litros = scan.nextDouble();

        System.out.println("Tipo de combustível:");
        String tipo = scan.next();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percDesconto = 0;
        double total = 0;
        double totalDesc = 0;

        if (tipo.equalsIgnoreCase("a")){
            if (litros <= 20){
                percDesconto = 3;
            } else {
                percDesconto = 5;
            }

            total = litros*precoAlc;

        } else if (tipo.equalsIgnoreCase("g")) {
            if (litros <= 20) {
                percDesconto = 4;
            } else {
                percDesconto = 6;
            }

            total = litros*precoGas;
        }

        totalDesc = (total/100)*percDesconto;
        double precoAPagar = total - totalDesc;

        System.out.println("Valor a ser pago: "+precoAPagar);


        //22
        System.out.println("Quantidade de morangos:");
        double qtdMorango = scan.nextDouble();

        System.out.println("Quantidade de maça:");
        double qtdMaca = scan.nextDouble();

        double precoKgMorango = 0;
        if (qtdMorango <= 5){
            precoKgMorango = 2.5;
        } else{
            precoKgMorango=2.2;
        }

        double precoKgMaca = 0;
        if (qtdMaca <=5){
            precoKgMaca = 1.8;
        }else{
            precoKgMaca=1.5;
        }

        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;

        double precoParcial = precoTotalMorango+precoTotalMaca;
        double precoTotal = precoParcial;

        if((qtdMorango+qtdMaca>8) || precoParcial>25){
            precoTotal = precoParcial-((precoParcial/100)*10);
        }
        System.out.println("Preço total = "+precoTotal);


        //23
        System.out.println("Tipo da carne:");
        System.out.println("1 - file duplo");
        System.out.println("2 - alcatra");
        System.out.println("3 - picanha");
        int tipo = scan.nextInt();

        System.out.println("Quantidade em kg:");
        double qtd = scan.nextDouble();

        double precoKg = 0;

        if(tipo == 1){

            System.out.println(qtd+"kg - file duplo");

            if(qtd<5){
                precoKg = 4.9;
            }else{
                precoKg=5.8;
            }
        }else if(tipo == 2){

            System.out.println(qtd+"kg - alcatra");

            if(qtd<5){
                precoKg = 5.9;
            }else{
                precoKg=6.8;
            }
        }else if(tipo == 3){

            System.out.println(qtd+"kg - picanha");

            if(qtd<5){
                precoKg = 6.9;
            }else{
                precoKg=7.8;
            }
        }

        double total = qtd*precoKg;
        System.out.println(qtd+"kg * "+precoKg+" = "+total);

        System.out.println("Compra no cortão? digite 1 para SIM");
        int cartao = scan.nextInt();

        if(cartao == 1){
            double desconto = (total/100)*5;
            System.out.println("Desconto de: "+desconto);
            System.out.println("Valor a pagar: "+(total-desconto));
        }else{
            System.out.println("Valor a pagar: "+total);
        }*/



    }
}

