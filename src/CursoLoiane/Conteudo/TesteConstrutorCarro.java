package CursoLoiane.Conteudo;

public class TesteConstrutorCarro {
    public static void main(String[] args) {

        ConstrutorCarro carro1 = new ConstrutorCarro("Audi", "A5", 4 , 140, 0.3);


        System.out.println(carro1.obterConsumo(100));



    }
}
