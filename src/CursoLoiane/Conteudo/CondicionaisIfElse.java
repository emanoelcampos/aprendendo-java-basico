package CursoLoiane.Conteudo;

import java.util.Scanner;

public class CondicionaisIfElse
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // IF somente executado se for TRUE
        /*System.out.println("Qual sua idade? ");

        int idade = scan.nextInt();


        if (idade >= 18)
        {
            System.out.println("É maior de idade;");
        }

        // ELSE somente executado se for FALSE
        System.out.println("Qual sua idade? ");

        int idade = scan.nextInt();

        if (idade >= 18)
        {
            System.out.println("É maior de idade.");
        }
            else
            {
                System.out.println("Não é maior de idade.");
            }*/

        //barato <= 10
        //10 < valor < 15 - pedir desconto
        //15 <= 17 - pesquisar mais
        //valor >= 17 - muito caro

        // Múltiplos IF - ELSE
        System.out.println("Qual é o preço do item?");
        double preco = scan.nextDouble();

        if (preco <= 10)
        {
            System.out.println("Está barato, pode comprar.");
        }
            else if (preco > 10 && preco < 15)
            {
                System.out.println("Você pode pedir um desconto.");
            }
            else if (preco >=15 && preco < 17)
            {
                System.out.println("Pode pesquisar mais.");
            }
            else //valor >=17
            {
                System.out.println("O preço está muito caro!");
            }
    }
}
