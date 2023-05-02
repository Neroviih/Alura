package Bytebank;

public class Conta {
    private String nome;
    private String tipoDeConta = "Tipo de conta: Conta Corrente";
    int agencia ;
    int numeroConta;
    double saldo;

    public Conta(int agencia, int numeroConta)  {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public void deposita(double var1){
        this.saldo += var1;
    }


    public void saca(double valor){
        if (this.saldo < valor) {
            System.out.println("Saldo: " + this.saldo + ", Valor: " + valor);

        } else {
            this.saldo -= valor;
        }
    }

    public void transferir(double valor, Conta destino){
        this.saca(valor);
        destino.deposita(valor);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }
}
