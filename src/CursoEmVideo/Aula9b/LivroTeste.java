package CursoEmVideo.Aula9b;

public class LivroTeste {
    public static void main(String[] args) {

        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[2];

        pessoa[0] = new Pessoa("Emanoel", 25, "MASCULINO");
        pessoa[1] = new Pessoa("Ana", 58, "MULHER");

        livro[0] = new Livro("Clube da Luta", "Chuck Palahniuk", 270, pessoa[0]);
        livro[1] = new Livro("Clube da Luta 2", "Chuck Palahniuk", 278, pessoa[1]);

        livro[0].abrir();
        livro[0].folhear(70);
        System.out.println(livro[0].detalhes());


    }
}
