package exercicio1extra;

public class ContaCorrente implements Conta {
   private Pessoa pessoa;
    private long saldo ;

    public ContaCorrente(Pessoa pessoa) {
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
