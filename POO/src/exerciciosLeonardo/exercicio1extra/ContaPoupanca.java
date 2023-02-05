package exercicio1extra;

public class ContaPoupanca implements Conta {
    private Pessoa pessoa;
    private long saldo ;

    public ContaPoupanca(Pessoa pessoa) {
        this.pessoa = pessoa;
        saldo = 0;
    }

    public long getSaldo(){
      return saldo;
    }    

    public Pessoa getPessoa() {
        return pessoa;
    }

    public boolean addSaldo(long saldo){
        this.saldo += saldo;
        return true;
    }


}
