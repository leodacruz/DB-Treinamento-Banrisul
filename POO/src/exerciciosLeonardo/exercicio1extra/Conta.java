package exercicio1extra;

public  class Conta {
    Pessoa pessoa;
    long saldo ;
    long limiteCheque;

    public Conta(Pessoa pessoa) {
        this.pessoa = pessoa;
        saldo = 0;
        limiteCheque=0;
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
    

    public Pessoa getPessoa() {
        return pessoa;
    }

    public long getLimiteCheque() {
        return limiteCheque;
    }

    public boolean setLimiteCheque(long valor){
        limiteCheque = valor;
        return true;
    }
}
