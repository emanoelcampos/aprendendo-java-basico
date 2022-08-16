package CursoEmVideo.Exer02;

public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipoConta; //corrente ou poupança CC ou CP
    private String dono;
    private double saldo;
    private boolean status; //conta aberta ou fechada

    //abrirConta, if true, que tipo, if CC +50, else if CP +150
    // fecharConta, true if saldo = 0
    // depositar, status true
    // sacar, status true && saque>= saldo
    // pagarMensal, CC -12, CP -20
    //gete set
    //metodo construtor conta criada: status = true && saldo = 0

    public void estadoAtual(){
        System.out.println("Conta: " +this.getNumConta());
        System.out.println("Tipo da conta: " +this.getTipo());
        System.out.println("Dono: " +this.getDono());
        System.out.println("Saldo: " +this.getSaldo());
        System.out.println("Status: " +this.getStatus());
        System.out.println();
    }

    //métodos:
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if(tipo.equalsIgnoreCase("CC")){
            this.setSaldo(50);
        }else if(tipo.equalsIgnoreCase("CP")){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, saldo: positivo");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada, saldo: negativo");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(double valorDeposito){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + valorDeposito);
            System.out.println("Depósito realizado na conta de " +this.getDono());
        }else{
            System.out.println("Não é possível fazer depósito.");
        }
    }



    public void sacar(double valorSaque){
        if(this.getStatus()){
            if(this.getSaldo() >= valorSaque){
                this.setSaldo(this.getSaldo() - valorSaque);
                System.out.println("Saque realizado na conta de " +this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Conta fechada");
        }
    }

    public void pagarMensal(){
        int valorTaxa = 0;
        if(getTipo().equalsIgnoreCase("CC")){
            valorTaxa = 12;
        }else if(getTipo().equalsIgnoreCase("CP")){
            valorTaxa = 20;
        }
        if(this.getStatus()){
            this.setSaldo(getSaldo() - valorTaxa);
            System.out.println("Mensalidade paga com sucesso por " +getDono());
        }else{
            System.out.println("Conta fechada");
        }
    }

    //métodos especiais:
    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }
    public int getNumConta() {
        return this.numConta;
    }

    public String getTipo() {
        return tipoConta;
    }
    public void setTipo(String tipo) {
        this.tipoConta = tipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }












}
