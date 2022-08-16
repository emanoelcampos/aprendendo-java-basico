package CursoLoiane.Conteudo;

public class CurtoCircuito
{
    public static void main(String[] args)
    {
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso &
                verdadeiro; //analisa as duas expressões
        boolean resultado2 = falso &&
                verdadeiro;//analisa o primeiro falso da o resultado

        System.out.println(resultado1);
        System.out.println(resultado2);

    }
}
