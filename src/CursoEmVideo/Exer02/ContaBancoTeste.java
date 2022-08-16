package CursoEmVideo.Exer02;

import CursoEmVideo.Exer02.ContaBanco;

public class ContaBancoTeste {
    public static void main(String[] args) {

        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(12345);
        conta1.setDono("Emanoel");
        conta1.abrirConta("CC");
        conta1.depositar(300);
        conta1.estadoAtual();

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(54321);
        conta2.setDono("Leoname");
        conta2.abrirConta("CP");
        conta2.depositar(500);
        conta2.sacar(100);
        conta2.estadoAtual();
















    }
}
