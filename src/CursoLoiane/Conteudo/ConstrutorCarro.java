package CursoLoiane.Conteudo;

public class ConstrutorCarro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    ConstrutorCarro(){}

    public ConstrutorCarro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
    }

    public ConstrutorCarro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public ConstrutorCarro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    private double kmDivididoPorConsumo(double km){
       return km/consumoCombustivel;
    }

    public double obterConsumo(double km){
        return kmDivididoPorConsumo(km);
    }







}
