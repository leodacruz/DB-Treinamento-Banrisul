package exercicio1extra;

public  class Conta {
    Pessoa pessoa;
    long saldo ;
    long limiteCheque;

    public Conta(Pessoa pessoa, long saldo) {
        this.pessoa = pessoa;
        this.saldo = saldo;
    }

    public long getSaldo(){
      return saldo;
    }

    public boolean saque(){
        return false;
    }

    public boolean deposito(int valor){
        return false;
    }
}
