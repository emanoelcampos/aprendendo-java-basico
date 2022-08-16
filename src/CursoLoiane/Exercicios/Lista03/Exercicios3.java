package CursoLoiane.Exercicios.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

       /*//01
        //IF-ELSE
        System.out.println("Informe uma nota de 0 a 10:");
        double nota = scan.nextDouble();

        if (nota >= 0 && nota <=10){
            System.out.println("Você digitou: "+nota);
        }else{
            System.out.println("Valor inválido, insira uma nota entre 0 e 10");
        }

        //DO-WHILE
        boolean notaValida = false;

        do{
            System.out.println("Entre com uma conta:");
            double nota = scan.nextDouble();

            if(nota>=0 && nota<=10){
                notaValida = true;
                System.out.println("Você digitou: "+nota);
            }else{
                //notaValida = false;
                System.out.println("Nota inválida, digite novamente:");
            }
        }while(!notaValida);

        //02
        boolean infValida = false;
        do{
            System.out.println("Entre com o nome de usuário:");
            String nome = scan.next();
            System.out.println("Entre com a senha de usuário:");
            String senha = scan.next();

            if(nome.equalsIgnoreCase(senha)){
                //infValida=false;
                System.out.println("ERRO!");
            }else{
                infValida = true;
                System.out.println("Usuário e senha válidos.");
            }
        }while(!infValida);

        //03
        boolean infValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;


        do{
            System.out.println("Entre com o nome:");
            nome = scan.next();

            if(nome.length()>=3){
                infValida=true;
            }else{
                System.out.println("Nome precisa no mínimo 3 caracteres.");
            }
        }while(!infValida);


        boolean infValida2 = false;
        do{
            System.out.println("Entre com idade:");
            idade= scan.nextInt();

            if(idade>=0 && idade<=150){
                infValida2=true;
            }else{
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        }while(!infValida2);


        boolean infValida3 = false;
        do{
            System.out.println("Entre com o salário:");
            salario= scan.nextDouble();

            if(salario>0){
                infValida3=true;
            }else{
                System.out.println("Salário precisa ser maior que 0");
            }
        }while(!infValida3);


        boolean infValida4 = false;
        do{
            System.out.println("Entre com o sexo:");
            sexo= scan.next();

            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                infValida4=true;
            }else{
                System.out.println("Sexo precisa ser f ou m");
            }
        }while(!infValida4);


        boolean infValida5 = false;
        do{
            System.out.println("Entre com estado civil:");
            estadoCivil= scan.next();

            if(estadoCivil.equalsIgnoreCase("s")||estadoCivil.equalsIgnoreCase("c")||estadoCivil.equalsIgnoreCase("v")||estadoCivil.equalsIgnoreCase("d")){
                infValida5=true;
            }else{
                System.out.println("Estado civil inválido.");
            }
        }while (!infValida5);

        //04
        int habA=80000;
        int habB=200000;
        int cont = 0;

        while(habA<habB){
            habA+=(habA/100)*3;
            habB+=(habB/100)*1.5;
            cont++;
        }

        System.out.println("População A: "+habA);
        System.out.println("População B: "+habB);
        System.out.println("Anos: "+cont);


        //05
        double habA;
        double habB;
        double pctA;
        double pctB;

        boolean valido = false;
        do{
            System.out.println("Entre com a pop A:");
            habA = scan.nextDouble();

            if(habA>0){
                valido=true;
            }else{
                System.out.println("pop precisa ser maior que 0.");
            }
        }while(!valido);

        valido = false;
        do{
            System.out.println("Entre com a pop B:");
            habB = scan.nextDouble();

            if(habB>0){
                valido=true;
            }else{
                System.out.println("pop precisa ser maior que 0.");
            }
        }while(!valido);

        valido = false;
        do{
            System.out.println("Entre com a pct A:");
            pctA = scan.nextDouble();

            if(pctA>0){
                valido=true;
            }else{
                System.out.println("pct precisa ser maior que 0.");
            }
        }while(!valido);

        valido = false;
        do{
            System.out.println("Entre com a pct B:");
            pctB = scan.nextDouble();

            if(pctB>0){
                valido=true;
            }else{
                System.out.println("pct precisa ser maior que 0.");
            }
        }while(!valido);

        int cont = 0;

        while(habA<habB){
            habA+=(habA/100)*pctA;
            habB+=(habB/100)*pctB;
            cont++;
        }

        System.out.println("População A: "+habA);
        System.out.println("População B: "+habB);
        System.out.println("Anos: "+cont);


        //06
        for(int num=1;num<=20;num++){
            System.out.print(num+" ");
        }

        //07
        int num;
        int maior = Integer.MIN_VALUE;

        for(int i = 0; i<5; i++){

            System.out.println("digite um número:");
            num = scan.nextInt();

            if (num > maior){
                maior = num;
            }
        }
        System.out.println("o maior número digito foi: "+maior);


        //08
        double num;
        double soma = 0;
        double media = 0;

        for(int cont = 0; cont<5; cont++){
            System.out.println("digite um número:");
            num = scan.nextInt();

            soma+=num;
            media=soma/5;
        }

        System.out.println("a soma é: "+soma);
        System.out.println("a média é: "+media);

        //09
        for(int cont = 1; cont<=50; cont++){

            if(cont % 2 != 0){
                System.out.println(cont);
            }
        }

        //10
        System.out.println("primeiro número:");
        int num1= scan.nextInt();
        System.out.println("segundo número");
        int num2= scan.nextInt();

        for(int i = (num1+1); i<num2; i++){
            System.out.println(i);

        }

        //11
        System.out.println("primeiro número:");
        int num1= scan.nextInt();
        System.out.println("segundo número");
        int num2= scan.nextInt();

        int soma = 0;

        for(int i = (num1+1); i<num2; i++){
            soma += i;
        }
        System.out.println("soma: "+soma);

        //12
        int result;
        int num;
        System.out.println("qual tabuada você quer de 1 a 10?");
        num = scan.nextInt();
        System.out.println("Tabuada do: "+num);

        for(int i = 1; i<=10; i++){
            result = num*i;

            System.out.println(num+" x "+i+" = "+result);
            //alternativa= (num*i);

        }

        //13
        System.out.println("primeiro número:");
        int base = scan.nextInt();
        System.out.println("segundo número:");
        int pot = scan.nextInt();

        int result = base;

        for(int i = 1; i<pot; i++){
            result*=base;

        }
        System.out.println(result);

        //14
        int num;
        int par = 0;
        int impar = 0;
        for(int i = 0; i<10; i++){
            System.out.println("digite um número:");
            num = scan.nextInt();

            if(num % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("pares: "+par);
        System.out.println("ímpares: "+impar);

        //15
        System.out.println("Entre com o n-ésimo termo:");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        for( int i = 3; i<=n; i++){
            proximo=primeiro+segundo;
            primeiro=segundo;
            segundo = proximo;

            System.out.println(proximo);
        }

        //16
        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;

        while(proximo <= 500){
            proximo=primeiro+segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }

        //17
        System.out.println("digite um número: ");
        int num = scan.nextInt();

        System.out.println(num+" ! = ");

        int fatorial = 1;

        for(int i = num; i>0; i--){
            fatorial *=i;
            System.out.println(i+" * ");
            }

        System.out.println("resultado: "+fatorial);

        //18
        System.out.println("digite um número:");
        int num = scan.nextInt();

        boolean primo = true;

        for(int i=2; i<num; i++){
            if(num%i==0){
                System.out.println("não é primo");
                primo = false;
            }
        }
        if(primo){
            System.out.println("é primo");
        }

        //19
        System.out.println("número de notas:");
        double numNotas = scan.nextDouble();

        double soma = 0;
        double media;

        for(int i = 0; i<numNotas; i++){
            System.out.println("digite a nota: ");
            double notas = scan.nextDouble();


            soma = soma + notas; //soma+=notas;


        }
        media = soma/numNotas;
        System.out.println("a média é: "+media);

        //20
        System.out.println("Quantas pessoas são:");
        double numPessoas = scan.nextDouble();


        double mediaIdade;
        double soma = 0;

        for(int i = 0; i<numPessoas; i++){
            System.out.println("Digite a idade da pessoa "+(i+1));
            double idade = scan.nextDouble();

            soma+=idade;
        }
        mediaIdade=soma/numPessoas;
        if(mediaIdade>=0 && mediaIdade<=25){
            System.out.println("jovem");
        }else if(mediaIdade>=26 && mediaIdade<=60){
            System.out.println("adulta");
        }else{
            System.out.println("idosa");
        }

        //21
        System.out.println("Informe número de turmas:");
        int turmas = scan.nextInt();

        double somaAlunos = 0;
        double alunos;
        boolean invalido;

        for(int i = 1; i<=turmas; i++)
        {
            invalido = true;
           do
           {
               System.out.println("Informe o número de alunos por turma: "+i);
               alunos = scan.nextDouble();

               if(alunos <= 40)
               {
                   invalido = false;
               }else
               {
                   System.out.println("Número de alunos inválido.");
               }
           }while(invalido);
           somaAlunos+=alunos;
        }

        double media = somaAlunos/turmas;

        System.out.println("A média de alunos por turma é: "+media);

        //22
        System.out.println("Informe número de CDs:");
        int numCds = scan.nextInt();

        double somaCds = 0;
        double mediaPreco;

        for(int i = 0; i<numCds; i++){
            System.out.println("Valor do CD "+(i+1));
            double valorCd = scan.nextDouble();

            somaCds+=valorCd;
        }

        mediaPreco=somaCds/numCds;
        System.out.println("A média de preço por CD é: "+mediaPreco);


        //23
        double preco = 1.99;
        double valorTabelado;

        for(int i = 1; i<=50; i++){
             valorTabelado = i*preco;

            System.out.println(i+" - R$"+valorTabelado);
        }


        //24
        double precoPao = 0.18;
        double valorTabelado;

        for(int i = 1; i<=50; i++){
            valorTabelado = i*precoPao;

            System.out.println(i+" - R$"+valorTabelado);
        }


        //25
        double valor;
        double totalCompra;
        double troco;
        boolean sair = false;
        int qtdProdutos;
        String novaCompra;
        String output = "";
        do
        {
            System.out.println("Nova compra:");
            novaCompra = scan.next();

            if (novaCompra.equalsIgnoreCase("s"))
            {
                System.out.println("Quantidade de produtos:");
                qtdProdutos = scan.nextInt();

                totalCompra = 0;

                for(int i = 1; i<=qtdProdutos; i++)
                {
                    System.out.println("Produto "+i);
                    valor = scan.nextDouble();
                    totalCompra +=valor;
                    output += "Produto "+i+": R$ "+valor+"\n";
                }

                System.out.println("Qual valor em dinheiro?");
                double pagamento = scan.nextDouble();

                troco = pagamento - totalCompra;


                System.out.println(output);
                System.out.println("Total: R$ "+totalCompra);
                System.out.println("Dinheiro: R$ "+pagamento);
                System.out.println("Troco: R$ "+troco);

            } else
            {
                sair = true;
            }
        }while(!sair);


        //26





















        */








    }
}
